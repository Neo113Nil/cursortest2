package com.arthenica.smartexception.java;

/* loaded from: classes.dex */
public class d implements com.arthenica.smartexception.d {
    @Override // com.arthenica.smartexception.d
    public String getModuleName(StackTraceElement stackTraceElement) {
        return "";
    }

    @Override // com.arthenica.smartexception.d
    public String getNativeMethodDefinition() {
        return "(Native Method)";
    }

    @Override // com.arthenica.smartexception.d
    public String getPackageInformation(StackTraceElement stackTraceElement) {
        StringBuilder sb = new StringBuilder();
        String className = stackTraceElement.getClassName();
        Class<?> loadClass = a.classLoader.loadClass(className);
        if (loadClass != null) {
            sb.append(com.arthenica.smartexception.a.packageInformation(com.arthenica.smartexception.a.libraryName(loadClass), com.arthenica.smartexception.a.version(a.packageLoader, loadClass, com.arthenica.smartexception.a.packageName(className))));
        }
        return sb.toString();
    }

    @Override // com.arthenica.smartexception.d
    public String getUnknownSourceDefinition() {
        return "(Unknown Source)";
    }

    @Override // com.arthenica.smartexception.d
    public String toString(StackTraceElement stackTraceElement, boolean z7, boolean z8) {
        StringBuilder sb = new StringBuilder();
        sb.append(stackTraceElement.getClassName());
        sb.append(".");
        sb.append(stackTraceElement.getMethodName());
        if (stackTraceElement.isNativeMethod()) {
            sb.append(getNativeMethodDefinition());
        } else if (stackTraceElement.getFileName() == null || stackTraceElement.getFileName().length() <= 0) {
            sb.append(getUnknownSourceDefinition());
        } else {
            sb.append("(");
            sb.append(stackTraceElement.getFileName());
            if (stackTraceElement.getLineNumber() >= 0) {
                sb.append(":");
                sb.append(stackTraceElement.getLineNumber());
            }
            sb.append(")");
        }
        if (z8) {
            sb.append(getPackageInformation(stackTraceElement));
        }
        return sb.toString();
    }
}
