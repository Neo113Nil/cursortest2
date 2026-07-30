package kotlin.io;

import f6.l;
import f6.p;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlin.sequences.m;

/* loaded from: classes4.dex */
public final class f implements m {
    private final FileWalkDirection direction;
    private final int maxDepth;
    private final l onEnter;
    private final p onFail;
    private final l onLeave;
    private final File start;

    private static abstract class a extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(File rootDir) {
            super(rootDir);
            s.checkNotNullParameter(rootDir, "rootDir");
        }
    }

    private final class b extends kotlin.collections.a {
        private final ArrayDeque<c> state;

        private final class a extends a {
            private boolean failed;
            private int fileIndex;
            private File[] fileList;
            private boolean rootVisited;
            final /* synthetic */ b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, File rootDir) {
                super(rootDir);
                s.checkNotNullParameter(rootDir, "rootDir");
                this.this$0 = bVar;
            }

            @Override // kotlin.io.f.c
            public File step() {
                if (!this.failed && this.fileList == null) {
                    l lVar = f.this.onEnter;
                    if (lVar != null && !((Boolean) lVar.invoke(getRoot())).booleanValue()) {
                        return null;
                    }
                    File[] listFiles = getRoot().listFiles();
                    this.fileList = listFiles;
                    if (listFiles == null) {
                        p pVar = f.this.onFail;
                        if (pVar != null) {
                            pVar.invoke(getRoot(), new AccessDeniedException(getRoot(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.failed = true;
                    }
                }
                File[] fileArr = this.fileList;
                if (fileArr != null) {
                    int i8 = this.fileIndex;
                    s.checkNotNull(fileArr);
                    if (i8 < fileArr.length) {
                        File[] fileArr2 = this.fileList;
                        s.checkNotNull(fileArr2);
                        int i9 = this.fileIndex;
                        this.fileIndex = i9 + 1;
                        return fileArr2[i9];
                    }
                }
                if (!this.rootVisited) {
                    this.rootVisited = true;
                    return getRoot();
                }
                l lVar2 = f.this.onLeave;
                if (lVar2 != null) {
                    lVar2.invoke(getRoot());
                }
                return null;
            }
        }

        /* renamed from: kotlin.io.f$b$b, reason: collision with other inner class name */
        private final class C0365b extends c {
            final /* synthetic */ b this$0;
            private boolean visited;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0365b(b bVar, File rootFile) {
                super(rootFile);
                s.checkNotNullParameter(rootFile, "rootFile");
                this.this$0 = bVar;
            }

            @Override // kotlin.io.f.c
            public File step() {
                if (this.visited) {
                    return null;
                }
                this.visited = true;
                return getRoot();
            }
        }

        private final class c extends a {
            private int fileIndex;
            private File[] fileList;
            private boolean rootVisited;
            final /* synthetic */ b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(b bVar, File rootDir) {
                super(rootDir);
                s.checkNotNullParameter(rootDir, "rootDir");
                this.this$0 = bVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:
            
                if (r0.length == 0) goto L31;
             */
            @Override // kotlin.io.f.c
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public File step() {
                p pVar;
                if (!this.rootVisited) {
                    l lVar = f.this.onEnter;
                    if (lVar != null && !((Boolean) lVar.invoke(getRoot())).booleanValue()) {
                        return null;
                    }
                    this.rootVisited = true;
                    return getRoot();
                }
                File[] fileArr = this.fileList;
                if (fileArr != null) {
                    int i8 = this.fileIndex;
                    s.checkNotNull(fileArr);
                    if (i8 >= fileArr.length) {
                        l lVar2 = f.this.onLeave;
                        if (lVar2 != null) {
                            lVar2.invoke(getRoot());
                        }
                        return null;
                    }
                }
                if (this.fileList == null) {
                    File[] listFiles = getRoot().listFiles();
                    this.fileList = listFiles;
                    if (listFiles == null && (pVar = f.this.onFail) != null) {
                        pVar.invoke(getRoot(), new AccessDeniedException(getRoot(), null, "Cannot list files in a directory", 2, null));
                    }
                    File[] fileArr2 = this.fileList;
                    if (fileArr2 != null) {
                        s.checkNotNull(fileArr2);
                    }
                    l lVar3 = f.this.onLeave;
                    if (lVar3 != null) {
                        lVar3.invoke(getRoot());
                    }
                    return null;
                }
                File[] fileArr3 = this.fileList;
                s.checkNotNull(fileArr3);
                int i9 = this.fileIndex;
                this.fileIndex = i9 + 1;
                return fileArr3[i9];
            }
        }

        public /* synthetic */ class d {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[FileWalkDirection.values().length];
                try {
                    iArr[FileWalkDirection.TOP_DOWN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FileWalkDirection.BOTTOM_UP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public b() {
            ArrayDeque<c> arrayDeque = new ArrayDeque<>();
            this.state = arrayDeque;
            if (f.this.start.isDirectory()) {
                arrayDeque.push(directoryState(f.this.start));
            } else if (f.this.start.isFile()) {
                arrayDeque.push(new C0365b(this, f.this.start));
            } else {
                done();
            }
        }

        private final a directoryState(File file) {
            int i8 = d.$EnumSwitchMapping$0[f.this.direction.ordinal()];
            if (i8 == 1) {
                return new c(this, file);
            }
            if (i8 == 2) {
                return new a(this, file);
            }
            throw new NoWhenBranchMatchedException();
        }

        private final File gotoNext() {
            File step;
            while (true) {
                c peek = this.state.peek();
                if (peek == null) {
                    return null;
                }
                step = peek.step();
                if (step == null) {
                    this.state.pop();
                } else {
                    if (s.areEqual(step, peek.getRoot()) || !step.isDirectory() || this.state.size() >= f.this.maxDepth) {
                        break;
                    }
                    this.state.push(directoryState(step));
                }
            }
            return step;
        }

        @Override // kotlin.collections.a
        protected void computeNext() {
            File gotoNext = gotoNext();
            if (gotoNext != null) {
                setNext(gotoNext);
            } else {
                done();
            }
        }
    }

    private static abstract class c {
        private final File root;

        public c(File root) {
            s.checkNotNullParameter(root, "root");
            this.root = root;
        }

        public final File getRoot() {
            return this.root;
        }

        public abstract File step();
    }

    private f(File file, FileWalkDirection fileWalkDirection, l lVar, l lVar2, p pVar, int i8) {
        this.start = file;
        this.direction = fileWalkDirection;
        this.onEnter = lVar;
        this.onLeave = lVar2;
        this.onFail = pVar;
        this.maxDepth = i8;
    }

    @Override // kotlin.sequences.m
    public Iterator<File> iterator() {
        return new b();
    }

    public final f maxDepth(int i8) {
        if (i8 > 0) {
            return new f(this.start, this.direction, this.onEnter, this.onLeave, this.onFail, i8);
        }
        throw new IllegalArgumentException("depth must be positive, but was " + i8 + '.');
    }

    public final f onEnter(l function) {
        s.checkNotNullParameter(function, "function");
        return new f(this.start, this.direction, function, this.onLeave, this.onFail, this.maxDepth);
    }

    public final f onFail(p function) {
        s.checkNotNullParameter(function, "function");
        return new f(this.start, this.direction, this.onEnter, this.onLeave, function, this.maxDepth);
    }

    public final f onLeave(l function) {
        s.checkNotNullParameter(function, "function");
        return new f(this.start, this.direction, this.onEnter, function, this.onFail, this.maxDepth);
    }

    /* synthetic */ f(File file, FileWalkDirection fileWalkDirection, l lVar, l lVar2, p pVar, int i8, int i9, o oVar) {
        this(file, (i9 & 2) != 0 ? FileWalkDirection.TOP_DOWN : fileWalkDirection, lVar, lVar2, pVar, (i9 & 32) != 0 ? Integer.MAX_VALUE : i8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(File start, FileWalkDirection direction) {
        this(start, direction, null, null, null, 0, 32, null);
        s.checkNotNullParameter(start, "start");
        s.checkNotNullParameter(direction, "direction");
    }

    public /* synthetic */ f(File file, FileWalkDirection fileWalkDirection, int i8, o oVar) {
        this(file, (i8 & 2) != 0 ? FileWalkDirection.TOP_DOWN : fileWalkDirection);
    }
}
