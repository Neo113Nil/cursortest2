package cn.hutool.core.io.watch;

import cn.hutool.core.io.file.d0;
import cn.hutool.core.lang.a0;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.ClosedWatchServiceException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class WatchServer extends Thread implements Closeable, Serializable {
    private static final long serialVersionUID = 1;
    protected WatchEvent.Kind<?>[] events;
    protected boolean isClosed;
    private WatchEvent.Modifier[] modifiers;
    private final Map<WatchKey, Path> watchKeyPathMap = new HashMap();
    private WatchService watchService;

    class a extends SimpleFileVisitor {
        a() {
        }

        @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
        public /* bridge */ /* synthetic */ FileVisitResult postVisitDirectory(Object obj, IOException iOException) {
            return postVisitDirectory(h.c.a(obj), iOException);
        }

        public FileVisitResult postVisitDirectory(Path path, IOException iOException) {
            WatchServer.this.registerPath(path, 0);
            return super.postVisitDirectory((a) path, iOException);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$watch$0(u uVar, WatchEvent watchEvent, Path path) {
        WatchEvent.Kind<?> kind;
        kind = watchEvent.kind();
        if (kind == WatchKind.CREATE.getValue()) {
            uVar.onCreate(watchEvent, path);
            return;
        }
        if (kind == WatchKind.MODIFY.getValue()) {
            uVar.onModify(watchEvent, path);
        } else if (kind == WatchKind.DELETE.getValue()) {
            uVar.onDelete(watchEvent, path);
        } else if (kind == WatchKind.OVERFLOW.getValue()) {
            uVar.onOverflow(watchEvent, path);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.isClosed = true;
        cn.hutool.core.io.n.close((Closeable) this.watchService);
    }

    public void init() {
        FileSystem fileSystem;
        WatchService newWatchService;
        try {
            fileSystem = FileSystems.getDefault();
            newWatchService = fileSystem.newWatchService();
            this.watchService = newWatchService;
            this.isClosed = false;
        } catch (IOException e8) {
            throw new WatchException(e8);
        }
    }

    public void registerPath(Path path, int i8) {
        WatchEvent.Kind[] kindArr = (WatchEvent.Kind[]) cn.hutool.core.util.h.defaultIfEmpty(this.events, WatchKind.ALL);
        try {
            this.watchKeyPathMap.put(cn.hutool.core.util.h.isEmpty((Object[]) this.modifiers) ? path.register(this.watchService, kindArr) : path.register(this.watchService, kindArr, this.modifiers), path);
            if (i8 > 1) {
                Files.walkFileTree(path, EnumSet.noneOf(d0.a()), i8, new a());
            }
        } catch (IOException e8) {
            if (!r.a(e8)) {
                throw new WatchException(e8);
            }
        }
    }

    public void setModifiers(WatchEvent.Modifier[] modifierArr) {
        this.modifiers = modifierArr;
    }

    public void watch(b bVar, a0 a0Var) {
        WatchKey take;
        List pollEvents;
        try {
            take = this.watchService.take();
            Path a8 = h.c.a(this.watchKeyPathMap.get(take));
            pollEvents = take.pollEvents();
            Iterator it = pollEvents.iterator();
            while (it.hasNext()) {
                WatchEvent<?> a9 = n.a(it.next());
                if (a0Var == null || a0Var.accept(a9)) {
                    bVar.doAction(a9, a8);
                }
            }
            take.reset();
        } catch (InterruptedException | ClosedWatchServiceException unused) {
            close();
        }
    }

    public void watch(final u uVar, a0 a0Var) {
        watch(new b() { // from class: cn.hutool.core.io.watch.t
            @Override // cn.hutool.core.io.watch.b
            public final void doAction(WatchEvent watchEvent, Path path) {
                WatchServer.lambda$watch$0(u.this, watchEvent, path);
            }
        }, a0Var);
    }
}
