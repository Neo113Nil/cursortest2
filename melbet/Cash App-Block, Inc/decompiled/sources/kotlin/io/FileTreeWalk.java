package kotlin.io;

import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.collections.AbstractIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.Sequence;

/* loaded from: classes.dex */
public final class FileTreeWalk implements Sequence {
    public final FileWalkDirection direction;
    public final int maxDepth;
    public final Function1 onEnter;
    public final Function2 onFail;
    public final Function1 onLeave;
    public final File start;

    public abstract class DirectoryState extends WalkState {
    }

    public final class FileTreeWalkIterator extends AbstractIterator {
        public final ArrayDeque state;

        public final class BottomUpDirectoryState extends DirectoryState {
            public boolean failed;
            public int fileIndex;
            public File[] fileList;
            public boolean rootVisited;
            public final /* synthetic */ FileTreeWalkIterator this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BottomUpDirectoryState(FileTreeWalkIterator fileTreeWalkIterator, File file) {
                super(file);
                file.getClass();
                this.this$0 = fileTreeWalkIterator;
            }

            @Override // kotlin.io.FileTreeWalk.WalkState
            public final File step() {
                FileTreeWalk fileTreeWalk = FileTreeWalk.this;
                boolean z = this.failed;
                File file = this.root;
                if (!z && this.fileList == null) {
                    Function1 function1 = fileTreeWalk.onEnter;
                    if (function1 == null || ((Boolean) function1.invoke(file)).booleanValue()) {
                        File[] listFiles = file.listFiles();
                        this.fileList = listFiles;
                        if (listFiles == null) {
                            Function2 function2 = fileTreeWalk.onFail;
                            if (function2 != null) {
                                File file2 = this.root;
                                function2.invoke(file2, new AccessDeniedException(file2, null, "Cannot list files in a directory", 2, null));
                            }
                            this.failed = true;
                        }
                    }
                    return null;
                }
                File[] fileArr = this.fileList;
                if (fileArr != null && this.fileIndex < fileArr.length) {
                    fileArr.getClass();
                    int i = this.fileIndex;
                    this.fileIndex = i + 1;
                    return fileArr[i];
                }
                if (!this.rootVisited) {
                    this.rootVisited = true;
                    return file;
                }
                Function1 function12 = fileTreeWalk.onLeave;
                if (function12 != null) {
                    function12.invoke(file);
                }
                return null;
            }
        }

        /* loaded from: classes9.dex */
        public final class SingleFileState extends WalkState {
            public boolean visited;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SingleFileState(File file) {
                super(file);
                file.getClass();
            }

            @Override // kotlin.io.FileTreeWalk.WalkState
            public final File step() {
                if (this.visited) {
                    return null;
                }
                this.visited = true;
                return this.root;
            }
        }

        /* loaded from: classes9.dex */
        public final class TopDownDirectoryState extends DirectoryState {
            public int fileIndex;
            public File[] fileList;
            public boolean rootVisited;
            public final /* synthetic */ FileTreeWalkIterator this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TopDownDirectoryState(FileTreeWalkIterator fileTreeWalkIterator, File file) {
                super(file);
                file.getClass();
                this.this$0 = fileTreeWalkIterator;
            }

            @Override // kotlin.io.FileTreeWalk.WalkState
            public final File step() {
                Function2 function2;
                FileTreeWalk fileTreeWalk = FileTreeWalk.this;
                boolean z = this.rootVisited;
                File file = this.root;
                if (z) {
                    File[] fileArr = this.fileList;
                    if (fileArr == null || this.fileIndex < fileArr.length) {
                        if (fileArr == null) {
                            File[] listFiles = file.listFiles();
                            this.fileList = listFiles;
                            if (listFiles == null && (function2 = fileTreeWalk.onFail) != null) {
                                File file2 = this.root;
                                function2.invoke(file2, new AccessDeniedException(file2, null, "Cannot list files in a directory", 2, null));
                            }
                            File[] fileArr2 = this.fileList;
                            if (fileArr2 == null || fileArr2.length == 0) {
                                Function1 function1 = fileTreeWalk.onLeave;
                                if (function1 != null) {
                                    function1.invoke(file);
                                }
                            }
                        }
                        File[] fileArr3 = this.fileList;
                        fileArr3.getClass();
                        int i = this.fileIndex;
                        this.fileIndex = i + 1;
                        return fileArr3[i];
                    }
                    Function1 function12 = fileTreeWalk.onLeave;
                    if (function12 != null) {
                        function12.invoke(file);
                        return null;
                    }
                } else {
                    Function1 function13 = fileTreeWalk.onEnter;
                    if (function13 == null || ((Boolean) function13.invoke(file)).booleanValue()) {
                        this.rootVisited = true;
                        return file;
                    }
                }
                return null;
            }
        }

        public FileTreeWalkIterator() {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.state = arrayDeque;
            File file = FileTreeWalk.this.start;
            if (file.isDirectory()) {
                arrayDeque.push(directoryState(file));
            } else if (file.isFile()) {
                arrayDeque.push(new SingleFileState(file));
            } else {
                super.state = 2;
            }
        }

        @Override // kotlin.collections.AbstractIterator
        public final void computeNext() {
            File file;
            File step;
            while (true) {
                ArrayDeque arrayDeque = this.state;
                WalkState walkState = (WalkState) arrayDeque.peek();
                if (walkState == null) {
                    file = null;
                    break;
                }
                step = walkState.step();
                if (step == null) {
                    arrayDeque.pop();
                } else if (step.equals(walkState.root) || !step.isDirectory() || arrayDeque.size() >= FileTreeWalk.this.maxDepth) {
                    break;
                } else {
                    arrayDeque.push(directoryState(step));
                }
            }
            file = step;
            if (file == null) {
                super.state = 2;
            } else {
                this.nextValue = file;
                super.state = 1;
            }
        }

        public final DirectoryState directoryState(File file) {
            int ordinal = FileTreeWalk.this.direction.ordinal();
            if (ordinal == 0) {
                return new TopDownDirectoryState(this, file);
            }
            if (ordinal == 1) {
                return new BottomUpDirectoryState(this, file);
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
    }

    public abstract class WalkState {
        public final File root;

        public WalkState(File file) {
            file.getClass();
            this.root = file;
        }

        public abstract File step();
    }

    public FileTreeWalk(File file, FileWalkDirection fileWalkDirection, Function1 function1, Function1 function12, Function2 function2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        fileWalkDirection = (i2 & 2) != 0 ? FileWalkDirection.TOP_DOWN : fileWalkDirection;
        i = (i2 & 32) != 0 ? Integer.MAX_VALUE : i;
        this.start = file;
        this.direction = fileWalkDirection;
        this.onEnter = function1;
        this.onLeave = function12;
        this.onFail = function2;
        this.maxDepth = i;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new FileTreeWalkIterator();
    }
}
