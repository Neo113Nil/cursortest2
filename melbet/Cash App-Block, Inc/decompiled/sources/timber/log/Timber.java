package timber.log;

import com.squareup.cash.clientrouting.observability.ClientRoutingError;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes3.dex */
public abstract class Timber {
    public static final Forest Forest = new Forest();
    public static final ArrayList trees = new ArrayList();
    public static volatile Tree[] treeArray = new Tree[0];

    public abstract class Tree {
        public final ThreadLocal explicitTag = new ThreadLocal();

        public void d(String str, Object... objArr) {
            prepareLog(3, null, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void e(String str, Object... objArr) {
            prepareLog(6, null, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void i(String str, Object... objArr) {
            prepareLog(4, null, str, Arrays.copyOf(objArr, objArr.length));
        }

        public abstract void log(int i, String str, String str2);

        public void log(String str, int i, Object... objArr) {
            prepareLog(i, null, str, Arrays.copyOf(objArr, objArr.length));
        }

        public final void prepareLog(int i, Throwable th, String str, Object... objArr) {
            ThreadLocal threadLocal = this.explicitTag;
            String str2 = (String) threadLocal.get();
            if (str2 != null) {
                threadLocal.remove();
            }
            if (str != null && str.length() != 0) {
                if (objArr.length != 0) {
                    Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                    str = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
                }
                if (th != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append((Object) str);
                    sb.append('\n');
                    StringWriter stringWriter = new StringWriter(256);
                    PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
                    th.printStackTrace(printWriter);
                    printWriter.flush();
                    String stringWriter2 = stringWriter.toString();
                    stringWriter2.getClass();
                    sb.append(stringWriter2);
                    str = sb.toString();
                }
            } else {
                if (th == null) {
                    return;
                }
                StringWriter stringWriter3 = new StringWriter(256);
                PrintWriter printWriter2 = new PrintWriter((Writer) stringWriter3, false);
                th.printStackTrace(printWriter2);
                printWriter2.flush();
                str = stringWriter3.toString();
                str.getClass();
            }
            log(i, str2, str);
        }

        public void v(String str, Object... objArr) {
            prepareLog(2, null, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void w(String str, Object... objArr) {
            prepareLog(5, null, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void d(String str, Object[] objArr, Throwable th) {
            prepareLog(3, th, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void e(String str, Object[] objArr, Throwable th) {
            prepareLog(6, th, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void i(Exception exc, String str, Object... objArr) {
            prepareLog(4, exc, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void w(String str, Object[] objArr, Throwable th) {
            prepareLog(5, th, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void d(Throwable th) {
            prepareLog(3, th, null, new Object[0]);
        }

        public void e(Throwable th) {
            prepareLog(6, th, null, new Object[0]);
        }

        public void i(ClientRoutingError clientRoutingError) {
            prepareLog(4, clientRoutingError, null, new Object[0]);
        }

        public void w(Throwable th) {
            prepareLog(5, th, null, new Object[0]);
        }
    }

    public final class Forest extends Tree {
        @Override // timber.log.Timber.Tree
        public final void d(String str, Object... objArr) {
            for (Tree tree : Timber.treeArray) {
                tree.d(str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // timber.log.Timber.Tree
        public final void e(String str, Object... objArr) {
            for (Tree tree : Timber.treeArray) {
                tree.e(str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // timber.log.Timber.Tree
        public final void i(Exception exc, String str, Object... objArr) {
            for (Tree tree : Timber.treeArray) {
                tree.i(exc, str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // timber.log.Timber.Tree
        public final void log(String str, int i, Object... objArr) {
            for (Tree tree : Timber.treeArray) {
                tree.log(str, i, Arrays.copyOf(objArr, objArr.length));
            }
        }

        public final void tag(String str) {
            str.getClass();
            Tree[] treeArr = Timber.treeArray;
            int length = treeArr.length;
            int i = 0;
            while (i < length) {
                Tree tree = treeArr[i];
                i++;
                tree.explicitTag.set(str);
            }
        }

        @Override // timber.log.Timber.Tree
        public final void v(String str, Object... objArr) {
            for (Tree tree : Timber.treeArray) {
                tree.v(str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // timber.log.Timber.Tree
        public final void w(String str, Object... objArr) {
            for (Tree tree : Timber.treeArray) {
                tree.w(str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // timber.log.Timber.Tree
        public final void d(String str, Object[] objArr, Throwable th) {
            for (Tree tree : Timber.treeArray) {
                tree.d(str, Arrays.copyOf(objArr, objArr.length), th);
            }
        }

        @Override // timber.log.Timber.Tree
        public final void e(String str, Object[] objArr, Throwable th) {
            for (Tree tree : Timber.treeArray) {
                tree.e(str, Arrays.copyOf(objArr, objArr.length), th);
            }
        }

        @Override // timber.log.Timber.Tree
        public final void i(ClientRoutingError clientRoutingError) {
            for (Tree tree : Timber.treeArray) {
                tree.i(clientRoutingError);
            }
        }

        @Override // timber.log.Timber.Tree
        public final void log(int i, String str, String str2) {
            str2.getClass();
            throw new AssertionError();
        }

        @Override // timber.log.Timber.Tree
        public final void w(String str, Object[] objArr, Throwable th) {
            for (Tree tree : Timber.treeArray) {
                tree.w(str, Arrays.copyOf(objArr, objArr.length), th);
            }
        }

        @Override // timber.log.Timber.Tree
        public final void d(Throwable th) {
            for (Tree tree : Timber.treeArray) {
                tree.d(th);
            }
        }

        @Override // timber.log.Timber.Tree
        public final void e(Throwable th) {
            for (Tree tree : Timber.treeArray) {
                tree.e(th);
            }
        }

        @Override // timber.log.Timber.Tree
        public final void i(String str, Object... objArr) {
            for (Tree tree : Timber.treeArray) {
                tree.i(str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // timber.log.Timber.Tree
        public final void w(Throwable th) {
            for (Tree tree : Timber.treeArray) {
                tree.w(th);
            }
        }
    }
}
