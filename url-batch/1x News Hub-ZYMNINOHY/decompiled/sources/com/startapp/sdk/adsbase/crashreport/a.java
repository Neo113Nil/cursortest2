package com.startapp.sdk.adsbase.crashreport;

import android.content.Context;
import android.text.TextUtils;
import com.startapp.sdk.adsbase.crashreport.ThreadsState;
import com.startapp.sdk.internal.InterfaceC0285d;
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
public final class a implements InterfaceC0285d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3314a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3315b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3316c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3317d;

    public a(Context context, boolean z, boolean z2, boolean z3) {
        this.f3314a = context;
        this.f3315b = z;
        this.f3316c = z2;
        this.f3317d = z3;
    }

    @Override // com.startapp.sdk.internal.InterfaceC0285d
    public final boolean a(String str, long j3) {
        HashSet hashSet;
        zh zhVar = new zh();
        zhVar.f4893a = "com.startapp.";
        zhVar.f4897e = this.f3315b;
        zhVar.f = this.f3316c;
        zhVar.f4896d = j3;
        zhVar.f4894b = str;
        if (this.f3317d) {
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
        zhVar.f4895c = hashSet;
        ThreadsState threadsState = new ThreadsState(zhVar);
        if (threadsState.c() == null) {
            return false;
        }
        e7.a(this.f3314a, null, "StartappAnrTrace", threadsState);
        return true;
    }

    @Override // com.startapp.sdk.internal.InterfaceC0285d
    public final void remove() {
        if (new File(this.f3314a.getCacheDir(), "StartappAnrTrace").exists()) {
            e7.a(this.f3314a, "StartappAnrTrace");
        }
    }

    @Override // com.startapp.sdk.internal.InterfaceC0285d
    public final void a() {
        ThreadsState threadsState;
        ThreadsState.ShrunkStackTraceElement[] shrunkStackTraceElementArr;
        ByteArrayOutputStream byteArrayOutputStream;
        StackTraceElement stackTraceElement;
        if (new File(this.f3314a.getCacheDir(), "StartappAnrTrace").exists() && (threadsState = (ThreadsState) e7.a(this.f3314a, (String) null, "StartappAnrTrace")) != null) {
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
            Map c3 = threadsState.c();
            int i3 = 0;
            if (c3 == null) {
                shrunkStackTraceElementArr = null;
            } else {
                shrunkStackTraceElementArr = null;
                for (Map.Entry entry : c3.entrySet()) {
                    if (shrunkStackTraceElementArr == null) {
                        shrunkStackTraceElementArr = (ThreadsState.ShrunkStackTraceElement[]) entry.getValue();
                    }
                    String str = (String) entry.getKey();
                    ThreadsState.ShrunkStackTraceElement[] shrunkStackTraceElementArr2 = (ThreadsState.ShrunkStackTraceElement[]) entry.getValue();
                    printWriter.print('\"');
                    printWriter.print(str);
                    printWriter.println('\"');
                    int length = shrunkStackTraceElementArr2.length;
                    int i4 = 0;
                    while (i4 < length) {
                        ThreadsState.ShrunkStackTraceElement shrunkStackTraceElement = shrunkStackTraceElementArr2[i4];
                        if (shrunkStackTraceElement.a() != 0) {
                            printWriter.print('\t');
                            byteArrayOutputStream = byteArrayOutputStream2;
                            printWriter.println(shrunkStackTraceElement.a());
                        } else {
                            byteArrayOutputStream = byteArrayOutputStream2;
                        }
                        StackTraceElement b3 = shrunkStackTraceElement.b();
                        if (b3 != null) {
                            printWriter.print('\t');
                            printWriter.print("at ");
                            printWriter.print(b3.getClassName());
                            printWriter.print('.');
                            printWriter.print(b3.getMethodName());
                            printWriter.print('(');
                            printWriter.print(b3.getFileName());
                            printWriter.print(':');
                            printWriter.print(b3.getLineNumber());
                            printWriter.println(')');
                        }
                        i4++;
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
                if (i3 >= length2) {
                    stackTraceElement = null;
                    break;
                }
                stackTraceElement = shrunkStackTraceElementArr[i3].b();
                if (stackTraceElement != null && stackTraceElement.getClassName().startsWith("com.startapp.")) {
                    break;
                } else {
                    i3++;
                }
            }
            if (stackTraceElement == null) {
                return;
            }
            String byteArrayOutputStream4 = byteArrayOutputStream3.toString();
            d9 d9Var = new d9(e9.f3727h);
            d9Var.f3680d = stackTraceElement.getClassName() + '.' + stackTraceElement.getMethodName();
            d9Var.f3681e = byteArrayOutputStream4;
            d9Var.a();
        }
    }
}
