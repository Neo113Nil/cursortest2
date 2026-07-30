package cn.hutool.core.lang;

import java.io.PrintStream;
import java.util.Scanner;

/* loaded from: classes.dex */
public class w {
    private static final String TEMPLATE_VAR = "{}";

    private static String buildTemplateSplitBySpace(int i8) {
        return cn.hutool.core.text.l.repeatAndJoin(TEMPLATE_VAR, i8, cn.hutool.core.text.l.SPACE);
    }

    public static void error() {
        System.err.println();
    }

    private static void errorInternal(String str, Object... objArr) {
        error(null, str, objArr);
    }

    public static String input() {
        return scanner().nextLine();
    }

    public static Integer lineNumber() {
        return Integer.valueOf(new Throwable().getStackTrace()[1].getLineNumber());
    }

    public static void log() {
        System.out.println();
    }

    private static void logInternal(String str, Object... objArr) {
        log(null, str, objArr);
    }

    public static void print(Object obj) {
        print(TEMPLATE_VAR, obj);
    }

    private static void printInternal(String str, Object... objArr) {
        System.out.print(cn.hutool.core.text.l.format(str, objArr));
    }

    public static void printProgress(char c8, int i8) {
        print("{}{}", '\r', cn.hutool.core.text.l.repeat(c8, i8));
    }

    public static Scanner scanner() {
        return new Scanner(System.in);
    }

    public static void table(x xVar) {
        print(xVar.toString());
    }

    public static String where() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        return String.format("%s.%s(%s:%s)", stackTraceElement.getClassName(), stackTraceElement.getMethodName(), stackTraceElement.getFileName(), Integer.valueOf(stackTraceElement.getLineNumber()));
    }

    public static void error(Object obj) {
        if (!(obj instanceof Throwable)) {
            error(TEMPLATE_VAR, obj);
        } else {
            Throwable th = (Throwable) obj;
            error(th, th.getMessage(), new Object[0]);
        }
    }

    public static void log(Object obj) {
        if (!(obj instanceof Throwable)) {
            log(TEMPLATE_VAR, obj);
        } else {
            Throwable th = (Throwable) obj;
            log(th, th.getMessage(), new Object[0]);
        }
    }

    public static void print(Object obj, Object... objArr) {
        if (cn.hutool.core.util.h.isEmpty(objArr)) {
            print(obj);
        } else {
            print(buildTemplateSplitBySpace(objArr.length + 1), cn.hutool.core.util.h.insert(objArr, 0, obj));
        }
    }

    public static void printProgress(char c8, int i8, double d8) {
        q.isTrue(d8 >= com.github.mikephil.charting.utils.i.DOUBLE_EPSILON && d8 <= 1.0d, "Rate must between 0 and 1 (both include)", new Object[0]);
        printProgress(c8, (int) (i8 * d8));
    }

    public static void print(String str, Object... objArr) {
        if (!cn.hutool.core.util.h.isEmpty(objArr) && !cn.hutool.core.text.l.contains(str, TEMPLATE_VAR)) {
            printInternal(buildTemplateSplitBySpace(objArr.length + 1), cn.hutool.core.util.h.insert(objArr, 0, str));
        } else {
            printInternal(str, objArr);
        }
    }

    public static void error(Object obj, Object... objArr) {
        if (cn.hutool.core.util.h.isEmpty(objArr)) {
            error(obj);
        } else {
            error(buildTemplateSplitBySpace(objArr.length + 1), cn.hutool.core.util.h.insert(objArr, 0, obj));
        }
    }

    public static void log(Object obj, Object... objArr) {
        if (cn.hutool.core.util.h.isEmpty(objArr)) {
            log(obj);
        } else {
            log(buildTemplateSplitBySpace(objArr.length + 1), cn.hutool.core.util.h.insert(objArr, 0, obj));
        }
    }

    public static void error(String str, Object... objArr) {
        if (!cn.hutool.core.util.h.isEmpty(objArr) && !cn.hutool.core.text.l.contains(str, TEMPLATE_VAR)) {
            errorInternal(buildTemplateSplitBySpace(objArr.length + 1), cn.hutool.core.util.h.insert(objArr, 0, str));
        } else {
            errorInternal(str, objArr);
        }
    }

    public static void log(String str, Object... objArr) {
        if (!cn.hutool.core.util.h.isEmpty(objArr) && !cn.hutool.core.text.l.contains(str, TEMPLATE_VAR)) {
            logInternal(buildTemplateSplitBySpace(objArr.length + 1), cn.hutool.core.util.h.insert(objArr, 0, str));
        } else {
            logInternal(str, objArr);
        }
    }

    public static void error(Throwable th, String str, Object... objArr) {
        PrintStream printStream = System.err;
        printStream.println(cn.hutool.core.text.l.format(str, objArr));
        if (th != null) {
            th.printStackTrace(printStream);
            printStream.flush();
        }
    }

    public static void log(Throwable th, String str, Object... objArr) {
        PrintStream printStream = System.out;
        printStream.println(cn.hutool.core.text.l.format(str, objArr));
        if (th != null) {
            th.printStackTrace(printStream);
            printStream.flush();
        }
    }
}
