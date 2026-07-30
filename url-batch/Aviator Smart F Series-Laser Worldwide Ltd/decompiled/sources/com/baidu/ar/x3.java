package com.baidu.ar;

import android.content.Context;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Scanner;

/* loaded from: classes.dex */
public class x3 extends ArrayList<t3> {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference<Context> f3697a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3698b = false;

    /* renamed from: c, reason: collision with root package name */
    public String f3699c;

    /* renamed from: d, reason: collision with root package name */
    public int f3700d;

    /* renamed from: e, reason: collision with root package name */
    public int f3701e;

    public x3(Context context, String str, int i8, int i9) {
        this.f3697a = new WeakReference<>(context);
        this.f3700d = i8;
        this.f3699c = str;
        this.f3701e = i9;
    }

    public void a() {
        if (this.f3698b) {
            return;
        }
        c();
        this.f3698b = true;
    }

    public void b() {
        Context context;
        if (this.f3701e > 0 && (context = this.f3697a.get()) != null) {
            int size = size();
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    fileOutputStream = context.openFileOutput(this.f3699c, 0);
                    if (size > 0) {
                        int i8 = this.f3701e;
                        if (size > i8) {
                            size = i8;
                        }
                        for (int i9 = 0; i9 < size; i9++) {
                            fileOutputStream.write((t3.b((t3) get(i9)) + "\n").getBytes("utf-8"));
                        }
                    }
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            } finally {
                a(fileOutputStream);
            }
        }
    }

    public final void c() {
        Context context;
        Scanner scanner;
        Throwable th;
        FileInputStream fileInputStream;
        Exception e8;
        FileInputStream fileInputStream2;
        Scanner scanner2;
        Throwable th2;
        t3 b8;
        if (this.f3701e <= 0 || (context = this.f3697a.get()) == null || !context.getFileStreamPath(this.f3699c).exists()) {
            return;
        }
        try {
            fileInputStream = context.openFileInput(this.f3699c);
            try {
                scanner = new Scanner(fileInputStream, "utf-8");
                while (scanner.hasNextLine()) {
                    try {
                        String nextLine = scanner.nextLine();
                        if (nextLine != null && !nextLine.isEmpty() && (b8 = t3.b(nextLine)) != null) {
                            add(b8);
                        }
                    } catch (Exception e9) {
                        fileInputStream2 = fileInputStream;
                        scanner2 = scanner;
                        e8 = e9;
                        try {
                            e8.printStackTrace();
                            a(fileInputStream2);
                            a(scanner2);
                        } catch (Throwable th3) {
                            th2 = th3;
                            scanner = scanner2;
                            fileInputStream = fileInputStream2;
                            th = th2;
                            a(fileInputStream);
                            a(scanner);
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        a(fileInputStream);
                        a(scanner);
                        throw th;
                    }
                }
                a(fileInputStream);
                a(scanner);
            } catch (Exception e10) {
                e8 = e10;
                fileInputStream2 = fileInputStream;
                scanner2 = null;
                e8.printStackTrace();
                a(fileInputStream2);
                a(scanner2);
            } catch (Throwable th5) {
                th2 = th5;
                scanner = null;
                th = th2;
                a(fileInputStream);
                a(scanner);
                throw th;
            }
        } catch (Exception e11) {
            e8 = e11;
            fileInputStream = null;
        } catch (Throwable th6) {
            scanner = null;
            th = th6;
            fileInputStream = null;
        }
    }

    public void a(int i8) {
        if (i8 > 0) {
            t3[] t3VarArr = new t3[i8];
            for (int i9 = 0; i9 < i8; i9++) {
                t3VarArr[i9] = get(i9);
            }
            removeRange(0, i8);
            t3.a(t3VarArr);
        }
    }

    public void a(t3 t3Var) {
        if (size() < this.f3700d) {
            add(t3Var);
        }
    }

    public final void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }
}
