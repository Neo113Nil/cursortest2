package cn.hutool.core.io.watch;

import cn.hutool.core.io.IORuntimeException;
import cn.hutool.core.io.file.n0;
import cn.hutool.core.lang.a0;
import cn.hutool.core.util.g1;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.WatchEvent;
import java.nio.file.attribute.FileAttribute;

/* loaded from: classes.dex */
public class WatchMonitor extends WatchServer {
    private static final long serialVersionUID = 1;
    private Path filePath;
    private int maxDepth;
    private Path path;
    private u watcher;
    public static final WatchEvent.Kind<?> OVERFLOW = WatchKind.OVERFLOW.getValue();
    public static final WatchEvent.Kind<?> ENTRY_MODIFY = WatchKind.MODIFY.getValue();
    public static final WatchEvent.Kind<?> ENTRY_CREATE = WatchKind.CREATE.getValue();
    public static final WatchEvent.Kind<?> ENTRY_DELETE = WatchKind.DELETE.getValue();
    public static final WatchEvent.Kind<?>[] EVENTS_ALL = WatchKind.ALL;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WatchMonitor(File file, WatchEvent.Kind<?>... kindArr) {
        this(r1, kindArr);
        Path path;
        path = file.toPath();
    }

    public static WatchMonitor create(URL url, WatchEvent.Kind<?>... kindArr) {
        return create(url, 0, kindArr);
    }

    public static WatchMonitor createAll(URI uri, u uVar) {
        Path path;
        path = Paths.get(uri);
        return createAll(path, uVar);
    }

    private void doTakeAndWatch(u uVar) {
        super.watch(uVar, new a0() { // from class: cn.hutool.core.io.watch.i
            @Override // cn.hutool.core.lang.a0
            public final boolean accept(Object obj) {
                boolean lambda$doTakeAndWatch$0;
                lambda$doTakeAndWatch$0 = WatchMonitor.this.lambda$doTakeAndWatch$0((WatchEvent) obj);
                return lambda$doTakeAndWatch$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$doTakeAndWatch$0(WatchEvent watchEvent) {
        Object context;
        boolean endsWith;
        Path path = this.filePath;
        if (path != null) {
            context = watchEvent.context();
            endsWith = path.endsWith(context.toString());
            if (!endsWith) {
                return false;
            }
        }
        return true;
    }

    private void registerPath() {
        registerPath(this.path, this.filePath != null ? 0 : this.maxDepth);
    }

    @Override // cn.hutool.core.io.watch.WatchServer
    public void init() {
        LinkOption linkOption;
        boolean exists;
        LinkOption linkOption2;
        boolean isRegularFile;
        Path parent;
        String path;
        Path parent2;
        Path path2 = this.path;
        linkOption = LinkOption.NOFOLLOW_LINKS;
        exists = Files.exists(path2, linkOption);
        if (exists) {
            Path path3 = this.path;
            linkOption2 = LinkOption.NOFOLLOW_LINKS;
            isRegularFile = Files.isRegularFile(path3, linkOption2);
            if (isRegularFile) {
                Path path4 = this.path;
                this.filePath = path4;
                parent = path4.getParent();
                this.path = parent;
            }
        } else {
            Path lastPathEle = n0.getLastPathEle(this.path);
            if (lastPathEle != null) {
                path = lastPathEle.toString();
                if (cn.hutool.core.text.l.contains((CharSequence) path, '.') && !cn.hutool.core.text.l.endWithIgnoreCase(path, ".d")) {
                    Path path5 = this.path;
                    this.filePath = path5;
                    parent2 = path5.getParent();
                    this.path = parent2;
                }
            }
            try {
                Files.createDirectories(this.path, new FileAttribute[0]);
            } catch (IOException e8) {
                throw new IORuntimeException(e8);
            }
        }
        super.init();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        watch();
    }

    public WatchMonitor setMaxDepth(int i8) {
        this.maxDepth = i8;
        return this;
    }

    public WatchMonitor setWatcher(u uVar) {
        this.watcher = uVar;
        return this;
    }

    public void watch() {
        watch(this.watcher);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WatchMonitor(String str, WatchEvent.Kind<?>... kindArr) {
        this(r2, kindArr);
        Path path;
        path = Paths.get(str, new String[0]);
    }

    public static WatchMonitor create(URL url, int i8, WatchEvent.Kind<?>... kindArr) {
        return create(g1.toURI(url), i8, kindArr);
    }

    public static WatchMonitor createAll(URL url, u uVar) {
        Path path;
        try {
            path = Paths.get(url.toURI());
            return createAll(path, uVar);
        } catch (URISyntaxException e8) {
            throw new WatchException(e8);
        }
    }

    public void watch(u uVar) {
        if (this.isClosed) {
            throw new WatchException("Watch Monitor is closed !");
        }
        registerPath();
        while (!this.isClosed) {
            doTakeAndWatch(uVar);
        }
    }

    public WatchMonitor(Path path, WatchEvent.Kind<?>... kindArr) {
        this(path, 0, kindArr);
    }

    public static WatchMonitor create(URI uri, WatchEvent.Kind<?>... kindArr) {
        return create(uri, 0, kindArr);
    }

    public WatchMonitor(Path path, int i8, WatchEvent.Kind<?>... kindArr) {
        this.path = path;
        this.maxDepth = i8;
        this.events = kindArr;
        init();
    }

    public static WatchMonitor create(URI uri, int i8, WatchEvent.Kind<?>... kindArr) {
        Path path;
        path = Paths.get(uri);
        return create(path, i8, kindArr);
    }

    public static WatchMonitor createAll(File file, u uVar) {
        Path path;
        path = file.toPath();
        return createAll(path, uVar);
    }

    public static WatchMonitor create(File file, WatchEvent.Kind<?>... kindArr) {
        return create(file, 0, kindArr);
    }

    public static WatchMonitor createAll(String str, u uVar) {
        Path path;
        path = Paths.get(str, new String[0]);
        return createAll(path, uVar);
    }

    public static WatchMonitor create(File file, int i8, WatchEvent.Kind<?>... kindArr) {
        Path path;
        path = file.toPath();
        return create(path, i8, kindArr);
    }

    public static WatchMonitor createAll(Path path, u uVar) {
        WatchMonitor create = create(path, EVENTS_ALL);
        create.setWatcher(uVar);
        return create;
    }

    public static WatchMonitor create(String str, WatchEvent.Kind<?>... kindArr) {
        return create(str, 0, kindArr);
    }

    public static WatchMonitor create(String str, int i8, WatchEvent.Kind<?>... kindArr) {
        Path path;
        path = Paths.get(str, new String[0]);
        return create(path, i8, kindArr);
    }

    public static WatchMonitor create(Path path, WatchEvent.Kind<?>... kindArr) {
        return create(path, 0, kindArr);
    }

    public static WatchMonitor create(Path path, int i8, WatchEvent.Kind<?>... kindArr) {
        return new WatchMonitor(path, i8, kindArr);
    }
}
