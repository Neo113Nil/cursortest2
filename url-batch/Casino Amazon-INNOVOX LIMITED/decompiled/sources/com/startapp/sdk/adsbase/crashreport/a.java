package com.startapp.sdk.adsbase.crashreport;

import android.content.Context;
import android.text.TextUtils;
import com.startapp.sdk.adsbase.crashreport.ThreadsState;
import com.startapp.sdk.internal.d;
import com.startapp.sdk.internal.ih;
import com.startapp.sdk.internal.n8;
import com.startapp.sdk.internal.o8;
import com.startapp.sdk.internal.z6;
import com.startapp.sdk.internal.zh;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f139a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public a(Context context, boolean z, boolean z2, boolean z3) {
        this.f139a = context;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    @Override // com.startapp.sdk.internal.d
    public final boolean a(String str, long j) {
        HashSet hashSet;
        ih ihVar = new ih();
        ihVar.f278a = "com.startapp.";
        ihVar.e = this.b;
        ihVar.f = this.c;
        ihVar.d = j;
        ihVar.b = str;
        if (this.d) {
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
        ihVar.c = hashSet;
        ThreadsState threadsState = new ThreadsState(ihVar);
        if (threadsState.c() == null) {
            return false;
        }
        z6.a(this.f139a, null, "StartappAnrTrace", threadsState);
        return true;
    }

    @Override // com.startapp.sdk.internal.d
    public final void remove() {
        if (new File(this.f139a.getCacheDir(), "StartappAnrTrace").exists()) {
            z6.a(this.f139a, "StartappAnrTrace");
        }
    }

    @Override // com.startapp.sdk.internal.d
    public final void a() {
        ThreadsState threadsState;
        ThreadsState.ShrunkStackTraceElement[] shrunkStackTraceElementArr;
        ByteArrayOutputStream byteArrayOutputStream;
        StackTraceElement stackTraceElement;
        if (new File(this.f139a.getCacheDir(), "StartappAnrTrace").exists() && (threadsState = (ThreadsState) z6.a(this.f139a, (String) null, "StartappAnrTrace")) != null) {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            PrintWriter printWriter = new PrintWriter(zh.a(byteArrayOutputStream2));
            printWriter.print("\"delay: ");
            printWriter.print(threadsState.a());
            printWriter.println('\"');
            if (!TextUtils.isEmpty(threadsState.b())) {
                printWriter.print("\"handler: ");
                printWriter.print(threadsState.b());
                printWriter.println('\"');
            }
            Map c = threadsState.c();
            int i = 0;
            if (c == null) {
                shrunkStackTraceElementArr = null;
            } else {
                shrunkStackTraceElementArr = null;
                for (Map.Entry entry : c.entrySet()) {
                    if (shrunkStackTraceElementArr == null) {
                        shrunkStackTraceElementArr = (ThreadsState.ShrunkStackTraceElement[]) entry.getValue();
                    }
                    String str = (String) entry.getKey();
                    ThreadsState.ShrunkStackTraceElement[] shrunkStackTraceElementArr2 = (ThreadsState.ShrunkStackTraceElement[]) entry.getValue();
                    printWriter.print('\"');
                    printWriter.print(str);
                    printWriter.println('\"');
                    int length = shrunkStackTraceElementArr2.length;
                    int i2 = 0;
                    while (i2 < length) {
                        ThreadsState.ShrunkStackTraceElement shrunkStackTraceElement = shrunkStackTraceElementArr2[i2];
                        if (shrunkStackTraceElement.a() != 0) {
                            printWriter.print('\t');
                            byteArrayOutputStream = byteArrayOutputStream2;
                            printWriter.println(shrunkStackTraceElement.a());
                        } else {
                            byteArrayOutputStream = byteArrayOutputStream2;
                        }
                        StackTraceElement b = shrunkStackTraceElement.b();
                        if (b != null) {
                            printWriter.print('\t');
                            printWriter.print("at ");
                            printWriter.print(b.getClassName());
                            printWriter.print('.');
                            printWriter.print(b.getMethodName());
                            printWriter.print('(');
                            printWriter.print(b.getFileName());
                            printWriter.print(AbstractJsonLexerKt.COLON);
                            printWriter.print(b.getLineNumber());
                            printWriter.println(')');
                        }
                        i2++;
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
                if (i >= length2) {
                    stackTraceElement = null;
                    break;
                }
                stackTraceElement = shrunkStackTraceElementArr[i].b();
                if (stackTraceElement != null && stackTraceElement.getClassName().startsWith("com.startapp.")) {
                    break;
                } else {
                    i++;
                }
            }
            if (stackTraceElement == null) {
                return;
            }
            String byteArrayOutputStream4 = byteArrayOutputStream3.toString();
            n8 n8Var = new n8(o8.h);
            n8Var.d = stackTraceElement.getClassName() + '.' + stackTraceElement.getMethodName();
            n8Var.e = byteArrayOutputStream4;
            n8Var.a();
        }
    }
}
