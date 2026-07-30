package com.arthenica.smartexception.java;

/* loaded from: classes.dex */
public class c implements com.arthenica.smartexception.c {
    @Override // com.arthenica.smartexception.c
    public Package getPackage(ClassLoader classLoader, String str) {
        return Package.getPackage(com.arthenica.smartexception.a.packageName(str));
    }
}
