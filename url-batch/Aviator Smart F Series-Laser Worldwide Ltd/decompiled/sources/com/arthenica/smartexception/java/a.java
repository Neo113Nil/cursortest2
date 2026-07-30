package com.arthenica.smartexception.java;

import com.arthenica.smartexception.f;
import java.util.Set;

/* loaded from: classes.dex */
public class a {
    static com.arthenica.smartexception.c packageLoader = new c();
    static com.arthenica.smartexception.b classLoader = new b();

    static {
        com.arthenica.smartexception.a.setStackTraceElementSerializer(new d());
    }

    public static void clearGroupPackages() {
        com.arthenica.smartexception.a.clearGroupPackages();
    }

    public static void clearIgnorePackages() {
        com.arthenica.smartexception.a.clearIgnorePackages();
    }

    public static void clearRootPackages() {
        com.arthenica.smartexception.a.clearRootPackages();
    }

    public static boolean containsCause(Throwable th, Class<?> cls) {
        return com.arthenica.smartexception.a.containsCause(th, cls);
    }

    public static String getAllMessages(Throwable th) {
        return com.arthenica.smartexception.a.getAllMessages(th);
    }

    public static Throwable getCause(Throwable th) {
        return com.arthenica.smartexception.a.getCause(th);
    }

    public static boolean getIgnoreAllCauses() {
        return com.arthenica.smartexception.a.getIgnoreAllCauses();
    }

    public static boolean getPrintSuppressedExceptions() {
        return com.arthenica.smartexception.a.getPrintSuppressedExceptions();
    }

    public static com.arthenica.smartexception.d getStackTraceElementSerializer() {
        return com.arthenica.smartexception.a.getStackTraceElementSerializer();
    }

    public static String getStackTraceString(Throwable th) {
        return com.arthenica.smartexception.a.getStackTraceString(new f(th));
    }

    public static boolean isPrintPackageInformation() {
        return com.arthenica.smartexception.a.isPrintPackageInformation();
    }

    public static void registerGroupPackage(String str) {
        com.arthenica.smartexception.a.registerGroupPackage(str);
    }

    public static void registerIgnorePackage(String str, boolean z7) {
        com.arthenica.smartexception.a.registerIgnorePackage(str, z7);
    }

    public static void registerRootPackage(String str) {
        com.arthenica.smartexception.a.registerRootPackage(str);
    }

    public static Throwable searchCause(Throwable th, Class<?> cls) {
        return com.arthenica.smartexception.a.searchCause(th, cls);
    }

    public static void setIgnoreAllCauses(boolean z7) {
        com.arthenica.smartexception.a.setIgnoreAllCauses(z7);
    }

    public static void setPrintPackageInformation(boolean z7) {
        com.arthenica.smartexception.a.setPrintPackageInformation(z7);
    }

    public static void setPrintSuppressedExceptions(boolean z7) {
        com.arthenica.smartexception.a.setPrintSuppressedExceptions(z7);
    }

    public static void setStackTraceElementSerializer(com.arthenica.smartexception.d dVar) {
        com.arthenica.smartexception.a.setStackTraceElementSerializer(dVar);
    }

    public static boolean containsCause(Throwable th, Class<?> cls, String str) {
        return com.arthenica.smartexception.a.containsCause(th, cls, str);
    }

    public static Throwable getCause(Throwable th, int i8) {
        return com.arthenica.smartexception.a.getCause(th, i8);
    }

    public static String getStackTraceString(Throwable th, boolean z7) {
        return com.arthenica.smartexception.a.getStackTraceString(new f(th), z7);
    }

    public static Throwable searchCause(Throwable th, Class<?> cls, String str) {
        return com.arthenica.smartexception.a.searchCause(th, cls, str);
    }

    public static String getStackTraceString(Throwable th, Set<String> set, Set<String> set2, Set<String> set3) {
        return com.arthenica.smartexception.a.getStackTraceString(new f(th), set, set2, set3);
    }

    public static Throwable searchCause(Throwable th, Class<?> cls, String str, int i8) {
        return com.arthenica.smartexception.a.searchCause(th, cls, str, i8);
    }

    public static String getStackTraceString(Throwable th, Set<String> set, Set<String> set2, Set<String> set3, boolean z7) {
        return com.arthenica.smartexception.a.getStackTraceString(new f(th), set, set2, set3, z7);
    }

    public static Throwable searchCause(Throwable th, Class<?> cls, int i8) {
        return com.arthenica.smartexception.a.searchCause(th, cls, i8);
    }

    public static String getStackTraceString(Throwable th, Set<String> set, Set<String> set2, Set<String> set3, boolean z7, boolean z8) {
        return com.arthenica.smartexception.a.getStackTraceString(new f(th), set, set2, set3, z7, z8);
    }

    public static String getStackTraceString(Throwable th, Set<String> set, Set<String> set2, Set<String> set3, boolean z7, boolean z8, boolean z9) {
        return com.arthenica.smartexception.a.getStackTraceString(new f(th), set, set2, set3, z7, z8, z9);
    }

    public static String getStackTraceString(Throwable th, String str) {
        return com.arthenica.smartexception.a.getStackTraceString(new f(th), str);
    }

    public static String getStackTraceString(Throwable th, String str, String str2) {
        return com.arthenica.smartexception.a.getStackTraceString(new f(th), str, str2);
    }

    public static String getStackTraceString(Throwable th, int i8) {
        return com.arthenica.smartexception.a.getStackTraceString(new f(th), i8);
    }

    public static String getStackTraceString(Throwable th, int i8, boolean z7) {
        return com.arthenica.smartexception.a.getStackTraceString(new f(th), i8, z7);
    }

    public static String getStackTraceString(Throwable th, int i8, boolean z7, boolean z8) {
        return com.arthenica.smartexception.a.getStackTraceString(new f(th), i8, z7, z8);
    }

    public static String getStackTraceString(Throwable th, int i8, boolean z7, boolean z8, boolean z9) {
        return com.arthenica.smartexception.a.getStackTraceString(new f(th), i8, z7, z8, z9);
    }
}
