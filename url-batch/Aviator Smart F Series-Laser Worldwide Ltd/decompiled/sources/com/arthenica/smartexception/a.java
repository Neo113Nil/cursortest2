package com.arthenica.smartexception;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class a {
    public static final boolean DEFAULT_IGNORE_ALL_CAUSES = false;
    public static final int DEFAULT_MAX_DEPTH = 10;
    public static final boolean DEFAULT_PRINT_MODULE_NAME = true;
    public static final boolean DEFAULT_PRINT_PACKAGE_INFORMATION = false;
    public static final boolean DEFAULT_PRINT_SUPPRESSED_EXCEPTIONS = true;
    static d stackTraceElementSerializer;
    static final Set<String> rootPackageSet = Collections.synchronizedSet(new HashSet());
    static final Set<String> groupPackageSet = Collections.synchronizedSet(new HashSet());
    static final Set<String> ignorePackageSet = Collections.synchronizedSet(new HashSet());
    static final Set<String> ignoreCausePackageSet = Collections.synchronizedSet(new HashSet());
    static boolean ignoreAllCauses = false;
    static boolean printPackageInformation = false;
    static boolean printModuleName = true;
    static boolean printSuppressedExceptions = true;

    public static int appendStackTraceGroupElement(StringBuilder sb, String str, int i8, StackTraceElement stackTraceElement, boolean z7, boolean z8, String str2) {
        if (i8 > 0) {
            if (stackTraceElementSerializer == null) {
                throw new IllegalArgumentException("Stack trace element serializer not initialized.");
            }
            sb.append(str2);
            if (i8 == 1) {
                sb.append(stackTraceElementSerializer.toString(stackTraceElement, z7, z8));
            } else {
                sb.append(String.format("%s%s ... %d more", stackTraceElementSerializer.getModuleName(stackTraceElement), str, Integer.valueOf(i8 - 1)));
                if (z8) {
                    sb.append(stackTraceElementSerializer.getPackageInformation(stackTraceElement));
                }
            }
        }
        return 0;
    }

    public static void clearGroupPackages() {
        groupPackageSet.clear();
    }

    public static void clearIgnorePackages() {
        ignorePackageSet.clear();
        ignoreCausePackageSet.clear();
    }

    public static void clearRootPackages() {
        rootPackageSet.clear();
    }

    public static boolean containsCause(Throwable th, Class<?> cls) {
        return containsCause(th, cls, null);
    }

    public static boolean containsPackage(String str, Set<String> set) {
        return getContainingPackage(str, set) != null;
    }

    public static String getAllMessages(Throwable th) {
        StringBuilder sb = new StringBuilder();
        getAllMessages(th, sb);
        return sb.toString();
    }

    public static Throwable getCause(Throwable th) {
        return getCause(th, 10);
    }

    public static String getContainingPackage(String str, Set<String> set) {
        for (String str2 : set) {
            if (str.startsWith(str2)) {
                return str2;
            }
        }
        return null;
    }

    public static boolean getIgnoreAllCauses() {
        return ignoreAllCauses;
    }

    public static boolean getPrintModuleName() {
        return printModuleName;
    }

    public static boolean getPrintSuppressedExceptions() {
        return printSuppressedExceptions;
    }

    public static StackTraceElement[] getStackTrace(f fVar, int i8) {
        ArrayList arrayList = new ArrayList();
        if (fVar != null) {
            e[] stackTrace = fVar.getStackTrace();
            for (int i9 = 0; i9 < stackTrace.length && i9 < i8; i9++) {
                arrayList.add(stackTrace[i9].getStackTraceElement());
            }
        }
        return (StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]);
    }

    public static d getStackTraceElementSerializer() {
        return stackTraceElementSerializer;
    }

    public static String getStackTraceString(f fVar) {
        return getStackTraceString(fVar, rootPackageSet, groupPackageSet, ignorePackageSet, 0, ignoreAllCauses, printPackageInformation);
    }

    public static boolean isEmpty(String str) {
        return str == null || str.trim().length() == 0;
    }

    public static boolean isPrintPackageInformation() {
        return printPackageInformation;
    }

    public static String libraryName(Class<?> cls) {
        String url;
        int lastIndexOf;
        if (cls == null) {
            return null;
        }
        try {
            URL resource = cls.getClassLoader().getResource(cls.getName().replace('.', cn.hutool.core.io.file.c.UNIX_SEPARATOR) + ".class");
            if (resource == null || (lastIndexOf = (url = resource.toString()).lastIndexOf(33)) <= 0) {
                return null;
            }
            String substring = url.substring(0, lastIndexOf);
            int lastIndexOf2 = substring.lastIndexOf(47);
            if (lastIndexOf2 > 0) {
                substring = substring.substring(lastIndexOf2 + 1);
            }
            int lastIndexOf3 = substring.lastIndexOf(92);
            return lastIndexOf3 > 0 ? substring.substring(lastIndexOf3 + 1) : substring;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String packageInformation(String str, String str2) {
        boolean z7 = str != null;
        boolean z8 = str2 != null;
        if (!z7 && !z8) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(" [");
        if (z7) {
            sb.append(str);
        }
        if (z8) {
            if (!z7) {
                sb.append(str2);
            } else if (!str.contains(str2)) {
                sb.append(":");
                sb.append(str2);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static String packageName(String str) {
        int lastIndexOf;
        return (str != null && (lastIndexOf = str.lastIndexOf(".")) >= 0) ? str.substring(0, lastIndexOf) : "";
    }

    public static void registerGroupPackage(String str) {
        groupPackageSet.add(str);
    }

    public static void registerIgnorePackage(String str, boolean z7) {
        ignorePackageSet.add(str);
        if (z7) {
            ignoreCausePackageSet.add(str);
        }
    }

    public static void registerRootPackage(String str) {
        rootPackageSet.add(str);
    }

    public static Throwable searchCause(Throwable th, Class<?> cls) {
        return searchCause(th, cls, null, 10);
    }

    public static void setIgnoreAllCauses(boolean z7) {
        ignoreAllCauses = z7;
    }

    public static void setPrintModuleName(boolean z7) {
        printModuleName = z7;
    }

    public static void setPrintPackageInformation(boolean z7) {
        printPackageInformation = z7;
    }

    public static void setPrintSuppressedExceptions(boolean z7) {
        printSuppressedExceptions = z7;
    }

    public static void setStackTraceElementSerializer(d dVar) {
        stackTraceElementSerializer = dVar;
    }

    public static String version(c cVar, Class<?> cls, String str) {
        try {
            Package r02 = cls.getPackage();
            if (r02 != null) {
                return r02.getImplementationVersion();
            }
            Package r12 = cVar.getPackage(cls.getClassLoader(), str);
            if (r12 != null) {
                return r12.getImplementationVersion();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean containsCause(Throwable th, Class<?> cls, String str) {
        return searchCause(th, cls, str, 10) != null;
    }

    public static Throwable getCause(Throwable th, int i8) {
        Throwable cause;
        if (th == null) {
            return null;
        }
        return (i8 > 0 && (cause = th.getCause()) != null) ? getCause(cause, i8 - 1) : th;
    }

    public static String getStackTraceString(f fVar, boolean z7) {
        return getStackTraceString(fVar, rootPackageSet, groupPackageSet, ignorePackageSet, 0, z7, printPackageInformation);
    }

    public static Throwable searchCause(Throwable th, Class<?> cls, String str) {
        return searchCause(th, cls, str, 10);
    }

    public static String getStackTraceString(f fVar, Set<String> set, Set<String> set2, Set<String> set3) {
        return getStackTraceString(fVar, set, set2, set3, 0, ignoreAllCauses, printPackageInformation);
    }

    public static Throwable searchCause(Throwable th, Class<?> cls, String str, int i8) {
        Throwable cause;
        if (th == null) {
            return null;
        }
        if (isEmpty(str)) {
            if (th.getClass().equals(cls)) {
                return th;
            }
        } else if (th.getClass().equals(cls) && getAllMessages(th).toLowerCase().contains(str.toLowerCase())) {
            return th;
        }
        if (i8 > 0 && (cause = th.getCause()) != null) {
            return searchCause(cause, cls, str, i8 - 1);
        }
        return null;
    }

    public static void getAllMessages(Throwable th, StringBuilder sb) {
        if (th != null) {
            String message = th.getMessage();
            if (!isEmpty(message)) {
                if (sb.length() != 0) {
                    sb.append(System.lineSeparator());
                    sb.append(" - Caused by: ");
                }
                sb.append(message);
            }
            getAllMessages(th.getCause(), sb);
        }
    }

    public static String getStackTraceString(f fVar, Set<String> set, Set<String> set2, Set<String> set3, boolean z7) {
        return getStackTraceString(fVar, set, set2, set3, 0, z7, printPackageInformation);
    }

    public static String getStackTraceString(f fVar, Set<String> set, Set<String> set2, Set<String> set3, boolean z7, boolean z8) {
        return getStackTraceString(fVar, set, set2, set3, 0, z7, z8);
    }

    public static StackTraceElement[] getStackTrace(f fVar, Set<String> set, Set<String> set2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (fVar != null) {
            for (e eVar : fVar.getStackTrace()) {
                String className = eVar.getStackTraceElement().getClassName();
                if (!isEmpty(className)) {
                    if (containsPackage(className, set)) {
                        arrayList.addAll(arrayList2);
                        arrayList.add(eVar.getStackTraceElement());
                    } else if (!containsPackage(className, set2)) {
                        arrayList2.add(eVar.getStackTraceElement());
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(arrayList2);
        }
        return (StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]);
    }

    public static String getStackTraceString(f fVar, Set<String> set, Set<String> set2, Set<String> set3, boolean z7, boolean z8, boolean z9) {
        return getStackTraceString(fVar, set, set2, set3, 0, z7, z8, printModuleName, z9);
    }

    public static String getStackTraceString(f fVar, String str) {
        return getStackTraceString(fVar, (Set<String>) Collections.singleton(str), new HashSet(), new HashSet(), 0, ignoreAllCauses, printPackageInformation);
    }

    public static String getStackTraceString(f fVar, String str, String str2) {
        return getStackTraceString(fVar, (Set<String>) Collections.singleton(str), (Set<String>) Collections.singleton(str2), new HashSet(), 0, ignoreAllCauses, printPackageInformation);
    }

    public static Throwable searchCause(Throwable th, Class<?> cls, int i8) {
        Throwable cause;
        if (th == null) {
            return null;
        }
        if (th.getClass().equals(cls)) {
            return th;
        }
        if (i8 > 0 && (cause = th.getCause()) != null) {
            return searchCause(cause, cls, i8 - 1);
        }
        return null;
    }

    public static String getStackTraceString(f fVar, int i8) {
        return getStackTraceString(fVar, new HashSet(), new HashSet(), new HashSet(), i8, ignoreAllCauses, printPackageInformation);
    }

    public static String getStackTraceString(f fVar, int i8, boolean z7) {
        return getStackTraceString(fVar, new HashSet(), new HashSet(), new HashSet(), i8, z7, printPackageInformation);
    }

    public static String getStackTraceString(f fVar, int i8, boolean z7, boolean z8) {
        return getStackTraceString(fVar, new HashSet(), new HashSet(), new HashSet(), i8, z7, z8);
    }

    public static String getStackTraceString(f fVar, int i8, boolean z7, boolean z8, boolean z9) {
        return getStackTraceString(fVar, new HashSet(), new HashSet(), new HashSet(), i8, z7, z8, printModuleName, z9);
    }

    public static String getStackTraceString(f fVar, Set<String> set, Set<String> set2, Set<String> set3, int i8, boolean z7, boolean z8) {
        return getStackTraceString(fVar, set, set2, set3, i8, z7, z8, printModuleName);
    }

    public static String getStackTraceString(f fVar, Set<String> set, Set<String> set2, Set<String> set3, int i8, boolean z7, boolean z8, boolean z9) {
        return getStackTraceString(fVar, false, false, set, set2, set3, i8, z7, z8, z9, printSuppressedExceptions);
    }

    public static String getStackTraceString(f fVar, Set<String> set, Set<String> set2, Set<String> set3, int i8, boolean z7, boolean z8, boolean z9, boolean z10) {
        return getStackTraceString(fVar, false, false, set, set2, set3, i8, z7, z8, z9, z10);
    }

    public static String getStackTraceString(f fVar, boolean z7, boolean z8, Set<String> set, Set<String> set2, Set<String> set3, int i8, boolean z9, boolean z10, boolean z11, boolean z12) {
        return getStackTraceString(fVar, "", z7, z8, set, set2, set3, i8, z9, z10, z11, z12);
    }

    public static String getStackTraceString(f fVar, String str, boolean z7, boolean z8, Set<String> set, Set<String> set2, Set<String> set3, int i8, boolean z9, boolean z10, boolean z11, boolean z12) {
        StackTraceElement[] stackTrace;
        StringBuilder sb;
        int i9;
        StackTraceElement[] stackTraceElementArr;
        StringBuilder sb2 = new StringBuilder();
        if (fVar == null) {
            return "";
        }
        String className = fVar.getClassName();
        if (i8 > 0) {
            stackTrace = getStackTrace(fVar, i8);
        } else {
            stackTrace = getStackTrace(fVar, set, set3);
        }
        StackTraceElement[] stackTraceElementArr2 = stackTrace;
        String message = fVar.getMessage();
        if (isEmpty(message)) {
            message = fVar.getMessage();
        }
        if (z7) {
            sb2.append(System.lineSeparator());
            sb2.append(str);
            sb2.append("Caused by: ");
        } else if (z8) {
            sb2.append(System.lineSeparator());
            sb2.append(str);
            sb2.append("Suppressed: ");
        }
        sb2.append(className);
        if (!isEmpty(message)) {
            sb2.append(": ");
            sb2.append(message);
        }
        int length = stackTraceElementArr2.length;
        String str2 = null;
        StackTraceElement stackTraceElement = null;
        int i10 = 0;
        int i11 = 0;
        while (i11 < length) {
            StackTraceElement stackTraceElement2 = stackTraceElementArr2[i11];
            String containingPackage = getContainingPackage(stackTraceElement2.getClassName(), set2);
            if (containingPackage != null) {
                if (containingPackage.equals(str2)) {
                    i9 = i11;
                    stackTraceElementArr = stackTraceElementArr2;
                    i10++;
                } else {
                    stackTraceElementArr = stackTraceElementArr2;
                    i9 = i11;
                    appendStackTraceGroupElement(sb2, str2, i10, stackTraceElement, z11, z10, str);
                    sb2.append(System.lineSeparator());
                    sb2.append(str);
                    sb2.append("\tat ");
                    stackTraceElement = stackTraceElement2;
                    str2 = containingPackage;
                    i10 = 1;
                }
            } else {
                i9 = i11;
                stackTraceElementArr = stackTraceElementArr2;
                int appendStackTraceGroupElement = appendStackTraceGroupElement(sb2, str2, i10, stackTraceElement, z11, z10, str);
                sb2.append(System.lineSeparator());
                sb2.append(str);
                sb2.append("\tat ");
                if (stackTraceElementSerializer != null) {
                    sb2.append(str);
                    sb2.append(stackTraceElementSerializer.toString(stackTraceElement2, z11, z10));
                    i10 = appendStackTraceGroupElement;
                    str2 = null;
                } else {
                    throw new IllegalArgumentException("Stack trace element serializer not initialized.");
                }
            }
            i11 = i9 + 1;
            stackTraceElementArr2 = stackTraceElementArr;
        }
        appendStackTraceGroupElement(sb2, str2, i10, stackTraceElement, z11, z10, str);
        f[] suppressed = fVar.getSuppressed();
        if (suppressed != null && suppressed.length > 0 && z12) {
            int length2 = suppressed.length;
            int i12 = 0;
            while (i12 < length2) {
                StringBuilder sb3 = sb2;
                sb3.append(getStackTraceString(suppressed[i12], str + "\t", false, true, set, set2, set3, i8, z9, z10, z11, z12));
                i12++;
                className = className;
                sb2 = sb3;
            }
        }
        String str3 = className;
        StringBuilder sb4 = sb2;
        f cause = fVar.getCause();
        if (cause == null || containsPackage(str3, ignoreCausePackageSet) || z9) {
            sb = sb4;
        } else {
            sb = sb4;
            sb.append(getStackTraceString(cause, str, true, false, set, set2, set3, i8, z9, z10, z11, z12));
        }
        return sb.toString();
    }
}
