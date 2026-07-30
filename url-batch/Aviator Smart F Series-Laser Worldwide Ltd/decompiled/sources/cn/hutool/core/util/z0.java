package cn.hutool.core.util;

import cn.hutool.core.io.IORuntimeException;
import cn.hutool.core.lang.Pid;
import cn.hutool.core.text.StrBuilder;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/* loaded from: classes.dex */
public class z0 {
    public static void addShutdownHook(Runnable runnable) {
        Runtime.getRuntime().addShutdownHook(runnable instanceof Thread ? (Thread) runnable : new Thread(runnable));
    }

    private static String[] cmdSplit(String str) {
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        Stack stack = new Stack();
        StrBuilder strBuilder = c1.strBuilder();
        boolean z7 = false;
        for (int i8 = 0; i8 < length; i8++) {
            char charAt = str.charAt(i8);
            if (charAt != ' ') {
                if (charAt != '\"' && charAt != '\'') {
                    strBuilder.append(charAt);
                } else if (z7) {
                    if (charAt == ((Character) stack.peek()).charValue()) {
                        stack.pop();
                        z7 = false;
                    }
                    strBuilder.append(charAt);
                } else {
                    stack.push(Character.valueOf(charAt));
                    strBuilder.append(charAt);
                    z7 = true;
                }
            } else if (z7) {
                strBuilder.append(charAt);
            } else {
                arrayList.add(strBuilder.toString());
                strBuilder.reset();
            }
        }
        if (strBuilder.hasContent()) {
            arrayList.add(strBuilder.toString());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static void destroy(Process process) {
        if (process != null) {
            process.destroy();
        }
    }

    public static Process exec(String... strArr) {
        try {
            return new ProcessBuilder(handleCmds(strArr)).redirectErrorStream(true).start();
        } catch (IOException e8) {
            throw new IORuntimeException(e8);
        }
    }

    public static List<String> execForLines(String... strArr) {
        return execForLines(l.systemCharset(), strArr);
    }

    public static String execForStr(String... strArr) {
        return execForStr(l.systemCharset(), strArr);
    }

    public static String getErrorResult(Process process) {
        return getErrorResult(process, l.systemCharset());
    }

    public static long getFreeMemory() {
        return Runtime.getRuntime().freeMemory();
    }

    public static long getMaxMemory() {
        return Runtime.getRuntime().maxMemory();
    }

    public static int getPid() {
        return Pid.INSTANCE.get();
    }

    public static int getProcessorCount() {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        if (availableProcessors <= 0) {
            return 7;
        }
        return availableProcessors;
    }

    public static String getResult(Process process) {
        return getResult(process, l.systemCharset());
    }

    public static List<String> getResultLines(Process process) {
        return getResultLines(process, l.systemCharset());
    }

    public static long getTotalMemory() {
        return Runtime.getRuntime().totalMemory();
    }

    public static long getUsableMemory() {
        return (getMaxMemory() - getTotalMemory()) + getFreeMemory();
    }

    private static String[] handleCmds(String... strArr) {
        if (h.isEmpty((Object[]) strArr)) {
            throw new NullPointerException("Command is empty !");
        }
        if (1 != strArr.length) {
            return strArr;
        }
        String str = strArr[0];
        if (cn.hutool.core.text.l.isBlank(str)) {
            throw new NullPointerException("Command is blank !");
        }
        return cmdSplit(str);
    }

    public static List<String> execForLines(Charset charset, String... strArr) {
        return getResultLines(exec(strArr), charset);
    }

    public static String execForStr(Charset charset, String... strArr) {
        return getResult(exec(strArr), charset);
    }

    public static String getErrorResult(Process process, Charset charset) {
        InputStream inputStream;
        try {
            inputStream = process.getErrorStream();
        } catch (Throwable th) {
            th = th;
            inputStream = null;
        }
        try {
            String read = cn.hutool.core.io.n.read(inputStream, charset);
            cn.hutool.core.io.n.close((Closeable) inputStream);
            destroy(process);
            return read;
        } catch (Throwable th2) {
            th = th2;
            cn.hutool.core.io.n.close((Closeable) inputStream);
            destroy(process);
            throw th;
        }
    }

    public static String getResult(Process process, Charset charset) {
        InputStream inputStream;
        try {
            inputStream = process.getInputStream();
        } catch (Throwable th) {
            th = th;
            inputStream = null;
        }
        try {
            String read = cn.hutool.core.io.n.read(inputStream, charset);
            cn.hutool.core.io.n.close((Closeable) inputStream);
            destroy(process);
            return read;
        } catch (Throwable th2) {
            th = th2;
            cn.hutool.core.io.n.close((Closeable) inputStream);
            destroy(process);
            throw th;
        }
    }

    public static List<String> getResultLines(Process process, Charset charset) {
        InputStream inputStream;
        try {
            inputStream = process.getInputStream();
            try {
                List<String> list = (List) cn.hutool.core.io.n.readLines(inputStream, charset, new ArrayList());
                cn.hutool.core.io.n.close((Closeable) inputStream);
                destroy(process);
                return list;
            } catch (Throwable th) {
                th = th;
                cn.hutool.core.io.n.close((Closeable) inputStream);
                destroy(process);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    public static Process exec(String[] strArr, String... strArr2) {
        return exec(strArr, null, strArr2);
    }

    public static Process exec(String[] strArr, File file, String... strArr2) {
        try {
            return Runtime.getRuntime().exec(handleCmds(strArr2), strArr, file);
        } catch (IOException e8) {
            throw new IORuntimeException(e8);
        }
    }
}
