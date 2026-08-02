package com.startapp.sdk.adsbase.crashreport;

import android.content.Context;
import android.text.TextUtils;
import com.startapp.sdk.adsbase.crashreport.ThreadsState;
import com.startapp.sdk.internal.InterfaceC0363d;
import com.startapp.sdk.internal.d9;
import com.startapp.sdk.internal.e7;
import com.startapp.sdk.internal.e9;
import com.startapp.sdk.internal.si;
import com.startapp.sdk.internal.zh;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes.dex */
public final class a implements InterfaceC0363d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6404a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6405b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6406c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6407d;

    public a(Context context, boolean z, boolean z4, boolean z5) {
        this.f6404a = context;
        this.f6405b = z;
        this.f6406c = z4;
        this.f6407d = z5;
    }

    @Override // com.startapp.sdk.internal.InterfaceC0363d
    public final boolean a(String str, long j4) {
        HashSet hashSet;
        zh zhVar = new zh();
        zhVar.f8045a = "com.startapp.";
        zhVar.f8049e = this.f6405b;
        zhVar.f8050f = this.f6406c;
        zhVar.f8048d = j4;
        zhVar.f8046b = str;
        if (this.f6407d) {
            hashSet = new HashSet();
            hashSet.add("android.webkit.WebView.loadDataWithBaseURL");
            hashSet.add("android.webkit.WebView.<init>");
            hashSet.add("android.webkit.WebView.stopLoading");
            hashSet.add("android.webkit.WebView.loadUrl");
            hashSet.add("libcore.icu.LocaleData.initLocaleData");
            hashSet.add("android.os.BinderProxy.transact");
            hashSet.add("android.hardware.SystemSensorManager.registerListenerImpl");
            hashSet.add("android.hardware.SystemSensorManager.<init>");
            hashSet.add("java.lang.Thread.<init>");
            hashSet.add("android.content.ContextWrapper.checkSelfPermission");
        } else {
            hashSet = null;
        }
        zhVar.f8047c = hashSet;
        ThreadsState threadsState = new ThreadsState(zhVar);
        if (threadsState.c() == null) {
            return false;
        }
        e7.a(this.f6404a, null, "StartappAnrTrace", threadsState);
        return true;
    }

    @Override // com.startapp.sdk.internal.InterfaceC0363d
    public final void remove() {
        if (new File(this.f6404a.getCacheDir(), "StartappAnrTrace").exists()) {
            e7.a(this.f6404a, "StartappAnrTrace");
        }
    }

    @Override // com.startapp.sdk.internal.InterfaceC0363d
    public final void a() {
        ThreadsState threadsState;
        ThreadsState.ShrunkStackTraceElement[] shrunkStackTraceElementArr;
        ByteArrayOutputStream byteArrayOutputStream;
        StackTraceElement stackTraceElement;
        if (new File(this.f6404a.getCacheDir(), "StartappAnrTrace").exists() && (threadsState = (ThreadsState) e7.a(this.f6404a, (String) null, "StartappAnrTrace")) != null) {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            PrintWriter printWriter = new PrintWriter(si.a(byteArrayOutputStream2));
            printWriter.print("\"delay: ");
            printWriter.print(threadsState.a());
            printWriter.println('\"');
            if (!TextUtils.isEmpty(threadsState.b())) {
                printWriter.print("\"handler: ");
                printWriter.print(threadsState.b());
                printWriter.println('\"');
            }
            Map c4 = threadsState.c();
            int i4 = 0;
            if (c4 == null) {
                shrunkStackTraceElementArr = null;
            } else {
                shrunkStackTraceElementArr = null;
                for (Map.Entry entry : c4.entrySet()) {
                    if (shrunkStackTraceElementArr == null) {
                        shrunkStackTraceElementArr = (ThreadsState.ShrunkStackTraceElement[]) entry.getValue();
                    }
                    String str = (String) entry.getKey();
                    ThreadsState.ShrunkStackTraceElement[] shrunkStackTraceElementArr2 = (ThreadsState.ShrunkStackTraceElement[]) entry.getValue();
                    printWriter.print('\"');
                    printWriter.print(str);
                    printWriter.println('\"');
                    int length = shrunkStackTraceElementArr2.length;
                    int i5 = 0;
                    while (i5 < length) {
                        ThreadsState.ShrunkStackTraceElement shrunkStackTraceElement = shrunkStackTraceElementArr2[i5];
                        if (shrunkStackTraceElement.a() != 0) {
                            printWriter.print('\t');
                            byteArrayOutputStream = byteArrayOutputStream2;
                            printWriter.println(shrunkStackTraceElement.a());
                        } else {
                            byteArrayOutputStream = byteArrayOutputStream2;
                        }
                        StackTraceElement b4 = shrunkStackTraceElement.b();
                        if (b4 != null) {
                            printWriter.print('\t');
                            printWriter.print("at ");
                            printWriter.print(b4.getClassName());
                            printWriter.print('.');
                            printWriter.print(b4.getMethodName());
                            printWriter.print('(');
                            printWriter.print(b4.getFileName());
                            printWriter.print(':');
                            printWriter.print(b4.getLineNumber());
                            printWriter.println(')');
                        }
                        i5++;
                        byteArrayOutputStream2 = byteArrayOutputStream;
                    }
                }
            }
            ByteArrayOutputStream byteArrayOutputStream3 = byteArrayOutputStream2;
            printWriter.close();
            if (shrunkStackTraceElementArr == null) {
                return;
            }
            int length2 = shrunkStackTraceElementArr.length;
            while (true) {
                if (i4 >= length2) {
                    stackTraceElement = null;
                    break;
                }
                stackTraceElement = shrunkStackTraceElementArr[i4].b();
                if (stackTraceElement != null && stackTraceElement.getClassName().startsWith("com.startapp.")) {
                    break;
                } else {
                    i4++;
                }
            }
            if (stackTraceElement == null) {
                return;
            }
            String byteArrayOutputStream4 = byteArrayOutputStream3.toString();
            d9 d9Var = new d9(e9.f6842h);
            d9Var.f6792d = stackTraceElement.getClassName() + '.' + stackTraceElement.getMethodName();
            d9Var.f6793e = byteArrayOutputStream4;
            d9Var.a();
        }
    }
}
