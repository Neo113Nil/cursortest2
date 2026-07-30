package z4;

import H0.l;
import R5.q;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import c4.C0305k;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import s4.InterfaceC0893b;
import s4.m;
import y4.r;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ d f8721a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final q f8722b = R5.i.b(new C0305k(3));

    public static void a(s4.f binaryMessenger, final r rVar) {
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        Intrinsics.checkNotNullParameter(binaryMessenger, "binaryMessenger");
        Intrinsics.checkNotNullParameter("", "messageChannelSuffix");
        String i2 = r4.f.i("dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.canLaunchUrl", "");
        q qVar = f8722b;
        P0.i iVar = new P0.i(binaryMessenger, i2, (m) qVar.getValue(), null);
        if (rVar != null) {
            final int i5 = 0;
            iVar.m(new InterfaceC0893b() { // from class: z4.c
                @Override // s4.InterfaceC0893b
                public final void k(Object obj, P0.e reply) {
                    List d7;
                    List d8;
                    r rVar2;
                    List d9;
                    List d10;
                    List d11;
                    switch (i5) {
                        case 0:
                            e eVar = rVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            boolean z7 = false;
                            Object obj2 = ((List) obj).get(0);
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            try {
                                r rVar3 = (r) eVar;
                                rVar3.getClass();
                                Intent intent = new Intent("android.intent.action.VIEW");
                                intent.setData(Uri.parse(str));
                                ComponentName resolveActivity = intent.resolveActivity(((l) rVar3.f8619e).f911d.getPackageManager());
                                String shortString = resolveActivity == null ? null : resolveActivity.toShortString();
                                if (shortString != null) {
                                    z7 = !"{com.android.fallback/com.android.fallback.Fallback}".equals(shortString);
                                }
                                d7 = kotlin.collections.q.b(Boolean.valueOf(z7));
                            } catch (Throwable exception) {
                                Intrinsics.checkNotNullParameter(exception, "exception");
                                if (exception instanceof b) {
                                    b bVar = exception;
                                    d7 = kotlin.collections.r.d(bVar.f8717d, bVar.f8718e, null);
                                } else {
                                    d7 = kotlin.collections.r.d(exception.getClass().getSimpleName(), exception.toString(), r4.f.e("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                                }
                            }
                            reply.g(d7);
                            return;
                        case 1:
                            e eVar2 = rVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            boolean z8 = false;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj3;
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map map = (Map) obj4;
                            Object obj5 = list.get(2);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                rVar2 = (r) eVar2;
                            } catch (Throwable exception2) {
                                Intrinsics.checkNotNullParameter(exception2, "exception");
                                if (exception2 instanceof b) {
                                    b bVar2 = exception2;
                                    d8 = kotlin.collections.r.d(bVar2.f8717d, bVar2.f8718e, null);
                                } else {
                                    d8 = kotlin.collections.r.d(exception2.getClass().getSimpleName(), exception2.toString(), r4.f.e("Cause: ", exception2.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception2)));
                                }
                            }
                            if (((Activity) rVar2.f8620i) == null) {
                                throw new b();
                            }
                            Intent putExtra = new Intent("android.intent.action.VIEW").setData(Uri.parse(str2)).putExtra("com.android.browser.headers", r.a(map));
                            if (booleanValue && Build.VERSION.SDK_INT >= 30) {
                                putExtra.addFlags(1024);
                            }
                            try {
                                ((Activity) rVar2.f8620i).startActivity(putExtra);
                                z8 = true;
                            } catch (ActivityNotFoundException unused) {
                            }
                            d8 = kotlin.collections.q.b(Boolean.valueOf(z8));
                            reply.g(d8);
                            return;
                        case 2:
                            e eVar3 = rVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj6 = list2.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj6;
                            Object obj7 = list2.get(1);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj7).booleanValue();
                            Object obj8 = list2.get(2);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.urllauncher.WebViewOptions");
                            j jVar = (j) obj8;
                            Object obj9 = list2.get(3);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.urllauncher.BrowserOptions");
                            try {
                                d9 = kotlin.collections.q.b(Boolean.valueOf(((r) eVar3).b(str3, booleanValue2, jVar, (C1059a) obj9)));
                            } catch (Throwable exception3) {
                                Intrinsics.checkNotNullParameter(exception3, "exception");
                                if (exception3 instanceof b) {
                                    b bVar3 = exception3;
                                    d9 = kotlin.collections.r.d(bVar3.f8717d, bVar3.f8718e, null);
                                } else {
                                    d9 = kotlin.collections.r.d(exception3.getClass().getSimpleName(), exception3.toString(), r4.f.e("Cause: ", exception3.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception3)));
                                }
                            }
                            reply.g(d9);
                            return;
                        case 3:
                            e eVar4 = rVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                d10 = kotlin.collections.q.b(Boolean.valueOf(q.g.b((Context) ((r) eVar4).f8618d, Collections.EMPTY_LIST, false) != null));
                            } catch (Throwable exception4) {
                                Intrinsics.checkNotNullParameter(exception4, "exception");
                                if (exception4 instanceof b) {
                                    b bVar4 = exception4;
                                    d10 = kotlin.collections.r.d(bVar4.f8717d, bVar4.f8718e, null);
                                } else {
                                    d10 = kotlin.collections.r.d(exception4.getClass().getSimpleName(), exception4.toString(), r4.f.e("Cause: ", exception4.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception4)));
                                }
                            }
                            reply.g(d10);
                            return;
                        default:
                            e eVar5 = rVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                ((Context) ((r) eVar5).f8618d).sendBroadcast(new Intent("close action"));
                                d11 = kotlin.collections.q.b(null);
                            } catch (Throwable exception5) {
                                Intrinsics.checkNotNullParameter(exception5, "exception");
                                if (exception5 instanceof b) {
                                    b bVar5 = exception5;
                                    d11 = kotlin.collections.r.d(bVar5.f8717d, bVar5.f8718e, null);
                                } else {
                                    d11 = kotlin.collections.r.d(exception5.getClass().getSimpleName(), exception5.toString(), r4.f.e("Cause: ", exception5.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception5)));
                                }
                            }
                            reply.g(d11);
                            return;
                    }
                }
            });
        } else {
            iVar.m(null);
        }
        P0.i iVar2 = new P0.i(binaryMessenger, r4.f.i("dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.launchUrl", ""), (m) qVar.getValue(), null);
        if (rVar != null) {
            final int i7 = 1;
            iVar2.m(new InterfaceC0893b() { // from class: z4.c
                @Override // s4.InterfaceC0893b
                public final void k(Object obj, P0.e reply) {
                    List d7;
                    List d8;
                    r rVar2;
                    List d9;
                    List d10;
                    List d11;
                    switch (i7) {
                        case 0:
                            e eVar = rVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            boolean z7 = false;
                            Object obj2 = ((List) obj).get(0);
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            try {
                                r rVar3 = (r) eVar;
                                rVar3.getClass();
                                Intent intent = new Intent("android.intent.action.VIEW");
                                intent.setData(Uri.parse(str));
                                ComponentName resolveActivity = intent.resolveActivity(((l) rVar3.f8619e).f911d.getPackageManager());
                                String shortString = resolveActivity == null ? null : resolveActivity.toShortString();
                                if (shortString != null) {
                                    z7 = !"{com.android.fallback/com.android.fallback.Fallback}".equals(shortString);
                                }
                                d7 = kotlin.collections.q.b(Boolean.valueOf(z7));
                            } catch (Throwable exception) {
                                Intrinsics.checkNotNullParameter(exception, "exception");
                                if (exception instanceof b) {
                                    b bVar = exception;
                                    d7 = kotlin.collections.r.d(bVar.f8717d, bVar.f8718e, null);
                                } else {
                                    d7 = kotlin.collections.r.d(exception.getClass().getSimpleName(), exception.toString(), r4.f.e("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                                }
                            }
                            reply.g(d7);
                            return;
                        case 1:
                            e eVar2 = rVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            boolean z8 = false;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj3;
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map map = (Map) obj4;
                            Object obj5 = list.get(2);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                rVar2 = (r) eVar2;
                            } catch (Throwable exception2) {
                                Intrinsics.checkNotNullParameter(exception2, "exception");
                                if (exception2 instanceof b) {
                                    b bVar2 = exception2;
                                    d8 = kotlin.collections.r.d(bVar2.f8717d, bVar2.f8718e, null);
                                } else {
                                    d8 = kotlin.collections.r.d(exception2.getClass().getSimpleName(), exception2.toString(), r4.f.e("Cause: ", exception2.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception2)));
                                }
                            }
                            if (((Activity) rVar2.f8620i) == null) {
                                throw new b();
                            }
                            Intent putExtra = new Intent("android.intent.action.VIEW").setData(Uri.parse(str2)).putExtra("com.android.browser.headers", r.a(map));
                            if (booleanValue && Build.VERSION.SDK_INT >= 30) {
                                putExtra.addFlags(1024);
                            }
                            try {
                                ((Activity) rVar2.f8620i).startActivity(putExtra);
                                z8 = true;
                            } catch (ActivityNotFoundException unused) {
                            }
                            d8 = kotlin.collections.q.b(Boolean.valueOf(z8));
                            reply.g(d8);
                            return;
                        case 2:
                            e eVar3 = rVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj6 = list2.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj6;
                            Object obj7 = list2.get(1);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj7).booleanValue();
                            Object obj8 = list2.get(2);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.urllauncher.WebViewOptions");
                            j jVar = (j) obj8;
                            Object obj9 = list2.get(3);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.urllauncher.BrowserOptions");
                            try {
                                d9 = kotlin.collections.q.b(Boolean.valueOf(((r) eVar3).b(str3, booleanValue2, jVar, (C1059a) obj9)));
                            } catch (Throwable exception3) {
                                Intrinsics.checkNotNullParameter(exception3, "exception");
                                if (exception3 instanceof b) {
                                    b bVar3 = exception3;
                                    d9 = kotlin.collections.r.d(bVar3.f8717d, bVar3.f8718e, null);
                                } else {
                                    d9 = kotlin.collections.r.d(exception3.getClass().getSimpleName(), exception3.toString(), r4.f.e("Cause: ", exception3.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception3)));
                                }
                            }
                            reply.g(d9);
                            return;
                        case 3:
                            e eVar4 = rVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                d10 = kotlin.collections.q.b(Boolean.valueOf(q.g.b((Context) ((r) eVar4).f8618d, Collections.EMPTY_LIST, false) != null));
                            } catch (Throwable exception4) {
                                Intrinsics.checkNotNullParameter(exception4, "exception");
                                if (exception4 instanceof b) {
                                    b bVar4 = exception4;
                                    d10 = kotlin.collections.r.d(bVar4.f8717d, bVar4.f8718e, null);
                                } else {
                                    d10 = kotlin.collections.r.d(exception4.getClass().getSimpleName(), exception4.toString(), r4.f.e("Cause: ", exception4.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception4)));
                                }
                            }
                            reply.g(d10);
                            return;
                        default:
                            e eVar5 = rVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                ((Context) ((r) eVar5).f8618d).sendBroadcast(new Intent("close action"));
                                d11 = kotlin.collections.q.b(null);
                            } catch (Throwable exception5) {
                                Intrinsics.checkNotNullParameter(exception5, "exception");
                                if (exception5 instanceof b) {
                                    b bVar5 = exception5;
                                    d11 = kotlin.collections.r.d(bVar5.f8717d, bVar5.f8718e, null);
                                } else {
                                    d11 = kotlin.collections.r.d(exception5.getClass().getSimpleName(), exception5.toString(), r4.f.e("Cause: ", exception5.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception5)));
                                }
                            }
                            reply.g(d11);
                            return;
                    }
                }
            });
        } else {
            iVar2.m(null);
        }
        P0.i iVar3 = new P0.i(binaryMessenger, r4.f.i("dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.openUrlInApp", ""), (m) qVar.getValue(), null);
        if (rVar != null) {
            final int i8 = 2;
            iVar3.m(new InterfaceC0893b() { // from class: z4.c
                @Override // s4.InterfaceC0893b
                public final void k(Object obj, P0.e reply) {
                    List d7;
                    List d8;
                    r rVar2;
                    List d9;
                    List d10;
                    List d11;
                    switch (i8) {
                        case 0:
                            e eVar = rVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            boolean z7 = false;
                            Object obj2 = ((List) obj).get(0);
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            try {
                                r rVar3 = (r) eVar;
                                rVar3.getClass();
                                Intent intent = new Intent("android.intent.action.VIEW");
                                intent.setData(Uri.parse(str));
                                ComponentName resolveActivity = intent.resolveActivity(((l) rVar3.f8619e).f911d.getPackageManager());
                                String shortString = resolveActivity == null ? null : resolveActivity.toShortString();
                                if (shortString != null) {
                                    z7 = !"{com.android.fallback/com.android.fallback.Fallback}".equals(shortString);
                                }
                                d7 = kotlin.collections.q.b(Boolean.valueOf(z7));
                            } catch (Throwable exception) {
                                Intrinsics.checkNotNullParameter(exception, "exception");
                                if (exception instanceof b) {
                                    b bVar = exception;
                                    d7 = kotlin.collections.r.d(bVar.f8717d, bVar.f8718e, null);
                                } else {
                                    d7 = kotlin.collections.r.d(exception.getClass().getSimpleName(), exception.toString(), r4.f.e("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                                }
                            }
                            reply.g(d7);
                            return;
                        case 1:
                            e eVar2 = rVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            boolean z8 = false;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj3;
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map map = (Map) obj4;
                            Object obj5 = list.get(2);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                rVar2 = (r) eVar2;
                            } catch (Throwable exception2) {
                                Intrinsics.checkNotNullParameter(exception2, "exception");
                                if (exception2 instanceof b) {
                                    b bVar2 = exception2;
                                    d8 = kotlin.collections.r.d(bVar2.f8717d, bVar2.f8718e, null);
                                } else {
                                    d8 = kotlin.collections.r.d(exception2.getClass().getSimpleName(), exception2.toString(), r4.f.e("Cause: ", exception2.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception2)));
                                }
                            }
                            if (((Activity) rVar2.f8620i) == null) {
                                throw new b();
                            }
                            Intent putExtra = new Intent("android.intent.action.VIEW").setData(Uri.parse(str2)).putExtra("com.android.browser.headers", r.a(map));
                            if (booleanValue && Build.VERSION.SDK_INT >= 30) {
                                putExtra.addFlags(1024);
                            }
                            try {
                                ((Activity) rVar2.f8620i).startActivity(putExtra);
                                z8 = true;
                            } catch (ActivityNotFoundException unused) {
                            }
                            d8 = kotlin.collections.q.b(Boolean.valueOf(z8));
                            reply.g(d8);
                            return;
                        case 2:
                            e eVar3 = rVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj6 = list2.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj6;
                            Object obj7 = list2.get(1);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj7).booleanValue();
                            Object obj8 = list2.get(2);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.urllauncher.WebViewOptions");
                            j jVar = (j) obj8;
                            Object obj9 = list2.get(3);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.urllauncher.BrowserOptions");
                            try {
                                d9 = kotlin.collections.q.b(Boolean.valueOf(((r) eVar3).b(str3, booleanValue2, jVar, (C1059a) obj9)));
                            } catch (Throwable exception3) {
                                Intrinsics.checkNotNullParameter(exception3, "exception");
                                if (exception3 instanceof b) {
                                    b bVar3 = exception3;
                                    d9 = kotlin.collections.r.d(bVar3.f8717d, bVar3.f8718e, null);
                                } else {
                                    d9 = kotlin.collections.r.d(exception3.getClass().getSimpleName(), exception3.toString(), r4.f.e("Cause: ", exception3.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception3)));
                                }
                            }
                            reply.g(d9);
                            return;
                        case 3:
                            e eVar4 = rVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                d10 = kotlin.collections.q.b(Boolean.valueOf(q.g.b((Context) ((r) eVar4).f8618d, Collections.EMPTY_LIST, false) != null));
                            } catch (Throwable exception4) {
                                Intrinsics.checkNotNullParameter(exception4, "exception");
                                if (exception4 instanceof b) {
                                    b bVar4 = exception4;
                                    d10 = kotlin.collections.r.d(bVar4.f8717d, bVar4.f8718e, null);
                                } else {
                                    d10 = kotlin.collections.r.d(exception4.getClass().getSimpleName(), exception4.toString(), r4.f.e("Cause: ", exception4.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception4)));
                                }
                            }
                            reply.g(d10);
                            return;
                        default:
                            e eVar5 = rVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                ((Context) ((r) eVar5).f8618d).sendBroadcast(new Intent("close action"));
                                d11 = kotlin.collections.q.b(null);
                            } catch (Throwable exception5) {
                                Intrinsics.checkNotNullParameter(exception5, "exception");
                                if (exception5 instanceof b) {
                                    b bVar5 = exception5;
                                    d11 = kotlin.collections.r.d(bVar5.f8717d, bVar5.f8718e, null);
                                } else {
                                    d11 = kotlin.collections.r.d(exception5.getClass().getSimpleName(), exception5.toString(), r4.f.e("Cause: ", exception5.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception5)));
                                }
                            }
                            reply.g(d11);
                            return;
                    }
                }
            });
        } else {
            iVar3.m(null);
        }
        P0.i iVar4 = new P0.i(binaryMessenger, r4.f.i("dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.supportsCustomTabs", ""), (m) qVar.getValue(), null);
        if (rVar != null) {
            final int i9 = 3;
            iVar4.m(new InterfaceC0893b() { // from class: z4.c
                @Override // s4.InterfaceC0893b
                public final void k(Object obj, P0.e reply) {
                    List d7;
                    List d8;
                    r rVar2;
                    List d9;
                    List d10;
                    List d11;
                    switch (i9) {
                        case 0:
                            e eVar = rVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            boolean z7 = false;
                            Object obj2 = ((List) obj).get(0);
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            try {
                                r rVar3 = (r) eVar;
                                rVar3.getClass();
                                Intent intent = new Intent("android.intent.action.VIEW");
                                intent.setData(Uri.parse(str));
                                ComponentName resolveActivity = intent.resolveActivity(((l) rVar3.f8619e).f911d.getPackageManager());
                                String shortString = resolveActivity == null ? null : resolveActivity.toShortString();
                                if (shortString != null) {
                                    z7 = !"{com.android.fallback/com.android.fallback.Fallback}".equals(shortString);
                                }
                                d7 = kotlin.collections.q.b(Boolean.valueOf(z7));
                            } catch (Throwable exception) {
                                Intrinsics.checkNotNullParameter(exception, "exception");
                                if (exception instanceof b) {
                                    b bVar = exception;
                                    d7 = kotlin.collections.r.d(bVar.f8717d, bVar.f8718e, null);
                                } else {
                                    d7 = kotlin.collections.r.d(exception.getClass().getSimpleName(), exception.toString(), r4.f.e("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                                }
                            }
                            reply.g(d7);
                            return;
                        case 1:
                            e eVar2 = rVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            boolean z8 = false;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj3;
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map map = (Map) obj4;
                            Object obj5 = list.get(2);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                rVar2 = (r) eVar2;
                            } catch (Throwable exception2) {
                                Intrinsics.checkNotNullParameter(exception2, "exception");
                                if (exception2 instanceof b) {
                                    b bVar2 = exception2;
                                    d8 = kotlin.collections.r.d(bVar2.f8717d, bVar2.f8718e, null);
                                } else {
                                    d8 = kotlin.collections.r.d(exception2.getClass().getSimpleName(), exception2.toString(), r4.f.e("Cause: ", exception2.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception2)));
                                }
                            }
                            if (((Activity) rVar2.f8620i) == null) {
                                throw new b();
                            }
                            Intent putExtra = new Intent("android.intent.action.VIEW").setData(Uri.parse(str2)).putExtra("com.android.browser.headers", r.a(map));
                            if (booleanValue && Build.VERSION.SDK_INT >= 30) {
                                putExtra.addFlags(1024);
                            }
                            try {
                                ((Activity) rVar2.f8620i).startActivity(putExtra);
                                z8 = true;
                            } catch (ActivityNotFoundException unused) {
                            }
                            d8 = kotlin.collections.q.b(Boolean.valueOf(z8));
                            reply.g(d8);
                            return;
                        case 2:
                            e eVar3 = rVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj6 = list2.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj6;
                            Object obj7 = list2.get(1);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj7).booleanValue();
                            Object obj8 = list2.get(2);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.urllauncher.WebViewOptions");
                            j jVar = (j) obj8;
                            Object obj9 = list2.get(3);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.urllauncher.BrowserOptions");
                            try {
                                d9 = kotlin.collections.q.b(Boolean.valueOf(((r) eVar3).b(str3, booleanValue2, jVar, (C1059a) obj9)));
                            } catch (Throwable exception3) {
                                Intrinsics.checkNotNullParameter(exception3, "exception");
                                if (exception3 instanceof b) {
                                    b bVar3 = exception3;
                                    d9 = kotlin.collections.r.d(bVar3.f8717d, bVar3.f8718e, null);
                                } else {
                                    d9 = kotlin.collections.r.d(exception3.getClass().getSimpleName(), exception3.toString(), r4.f.e("Cause: ", exception3.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception3)));
                                }
                            }
                            reply.g(d9);
                            return;
                        case 3:
                            e eVar4 = rVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                d10 = kotlin.collections.q.b(Boolean.valueOf(q.g.b((Context) ((r) eVar4).f8618d, Collections.EMPTY_LIST, false) != null));
                            } catch (Throwable exception4) {
                                Intrinsics.checkNotNullParameter(exception4, "exception");
                                if (exception4 instanceof b) {
                                    b bVar4 = exception4;
                                    d10 = kotlin.collections.r.d(bVar4.f8717d, bVar4.f8718e, null);
                                } else {
                                    d10 = kotlin.collections.r.d(exception4.getClass().getSimpleName(), exception4.toString(), r4.f.e("Cause: ", exception4.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception4)));
                                }
                            }
                            reply.g(d10);
                            return;
                        default:
                            e eVar5 = rVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                ((Context) ((r) eVar5).f8618d).sendBroadcast(new Intent("close action"));
                                d11 = kotlin.collections.q.b(null);
                            } catch (Throwable exception5) {
                                Intrinsics.checkNotNullParameter(exception5, "exception");
                                if (exception5 instanceof b) {
                                    b bVar5 = exception5;
                                    d11 = kotlin.collections.r.d(bVar5.f8717d, bVar5.f8718e, null);
                                } else {
                                    d11 = kotlin.collections.r.d(exception5.getClass().getSimpleName(), exception5.toString(), r4.f.e("Cause: ", exception5.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception5)));
                                }
                            }
                            reply.g(d11);
                            return;
                    }
                }
            });
        } else {
            iVar4.m(null);
        }
        P0.i iVar5 = new P0.i(binaryMessenger, r4.f.i("dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.closeWebView", ""), (m) qVar.getValue(), null);
        if (rVar == null) {
            iVar5.m(null);
        } else {
            final int i10 = 4;
            iVar5.m(new InterfaceC0893b() { // from class: z4.c
                @Override // s4.InterfaceC0893b
                public final void k(Object obj, P0.e reply) {
                    List d7;
                    List d8;
                    r rVar2;
                    List d9;
                    List d10;
                    List d11;
                    switch (i10) {
                        case 0:
                            e eVar = rVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            boolean z7 = false;
                            Object obj2 = ((List) obj).get(0);
                            Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj2;
                            try {
                                r rVar3 = (r) eVar;
                                rVar3.getClass();
                                Intent intent = new Intent("android.intent.action.VIEW");
                                intent.setData(Uri.parse(str));
                                ComponentName resolveActivity = intent.resolveActivity(((l) rVar3.f8619e).f911d.getPackageManager());
                                String shortString = resolveActivity == null ? null : resolveActivity.toShortString();
                                if (shortString != null) {
                                    z7 = !"{com.android.fallback/com.android.fallback.Fallback}".equals(shortString);
                                }
                                d7 = kotlin.collections.q.b(Boolean.valueOf(z7));
                            } catch (Throwable exception) {
                                Intrinsics.checkNotNullParameter(exception, "exception");
                                if (exception instanceof b) {
                                    b bVar = exception;
                                    d7 = kotlin.collections.r.d(bVar.f8717d, bVar.f8718e, null);
                                } else {
                                    d7 = kotlin.collections.r.d(exception.getClass().getSimpleName(), exception.toString(), r4.f.e("Cause: ", exception.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception)));
                                }
                            }
                            reply.g(d7);
                            return;
                        case 1:
                            e eVar2 = rVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            boolean z8 = false;
                            Object obj3 = list.get(0);
                            Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj3;
                            Object obj4 = list.get(1);
                            Intrinsics.c(obj4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
                            Map map = (Map) obj4;
                            Object obj5 = list.get(2);
                            Intrinsics.c(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj5).booleanValue();
                            try {
                                rVar2 = (r) eVar2;
                            } catch (Throwable exception2) {
                                Intrinsics.checkNotNullParameter(exception2, "exception");
                                if (exception2 instanceof b) {
                                    b bVar2 = exception2;
                                    d8 = kotlin.collections.r.d(bVar2.f8717d, bVar2.f8718e, null);
                                } else {
                                    d8 = kotlin.collections.r.d(exception2.getClass().getSimpleName(), exception2.toString(), r4.f.e("Cause: ", exception2.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception2)));
                                }
                            }
                            if (((Activity) rVar2.f8620i) == null) {
                                throw new b();
                            }
                            Intent putExtra = new Intent("android.intent.action.VIEW").setData(Uri.parse(str2)).putExtra("com.android.browser.headers", r.a(map));
                            if (booleanValue && Build.VERSION.SDK_INT >= 30) {
                                putExtra.addFlags(1024);
                            }
                            try {
                                ((Activity) rVar2.f8620i).startActivity(putExtra);
                                z8 = true;
                            } catch (ActivityNotFoundException unused) {
                            }
                            d8 = kotlin.collections.q.b(Boolean.valueOf(z8));
                            reply.g(d8);
                            return;
                        case 2:
                            e eVar3 = rVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj6 = list2.get(0);
                            Intrinsics.c(obj6, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj6;
                            Object obj7 = list2.get(1);
                            Intrinsics.c(obj7, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue2 = ((Boolean) obj7).booleanValue();
                            Object obj8 = list2.get(2);
                            Intrinsics.c(obj8, "null cannot be cast to non-null type io.flutter.plugins.urllauncher.WebViewOptions");
                            j jVar = (j) obj8;
                            Object obj9 = list2.get(3);
                            Intrinsics.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.urllauncher.BrowserOptions");
                            try {
                                d9 = kotlin.collections.q.b(Boolean.valueOf(((r) eVar3).b(str3, booleanValue2, jVar, (C1059a) obj9)));
                            } catch (Throwable exception3) {
                                Intrinsics.checkNotNullParameter(exception3, "exception");
                                if (exception3 instanceof b) {
                                    b bVar3 = exception3;
                                    d9 = kotlin.collections.r.d(bVar3.f8717d, bVar3.f8718e, null);
                                } else {
                                    d9 = kotlin.collections.r.d(exception3.getClass().getSimpleName(), exception3.toString(), r4.f.e("Cause: ", exception3.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception3)));
                                }
                            }
                            reply.g(d9);
                            return;
                        case 3:
                            e eVar4 = rVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                d10 = kotlin.collections.q.b(Boolean.valueOf(q.g.b((Context) ((r) eVar4).f8618d, Collections.EMPTY_LIST, false) != null));
                            } catch (Throwable exception4) {
                                Intrinsics.checkNotNullParameter(exception4, "exception");
                                if (exception4 instanceof b) {
                                    b bVar4 = exception4;
                                    d10 = kotlin.collections.r.d(bVar4.f8717d, bVar4.f8718e, null);
                                } else {
                                    d10 = kotlin.collections.r.d(exception4.getClass().getSimpleName(), exception4.toString(), r4.f.e("Cause: ", exception4.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception4)));
                                }
                            }
                            reply.g(d10);
                            return;
                        default:
                            e eVar5 = rVar;
                            Intrinsics.checkNotNullParameter(reply, "reply");
                            try {
                                ((Context) ((r) eVar5).f8618d).sendBroadcast(new Intent("close action"));
                                d11 = kotlin.collections.q.b(null);
                            } catch (Throwable exception5) {
                                Intrinsics.checkNotNullParameter(exception5, "exception");
                                if (exception5 instanceof b) {
                                    b bVar5 = exception5;
                                    d11 = kotlin.collections.r.d(bVar5.f8717d, bVar5.f8718e, null);
                                } else {
                                    d11 = kotlin.collections.r.d(exception5.getClass().getSimpleName(), exception5.toString(), r4.f.e("Cause: ", exception5.getCause(), ", Stacktrace: ", Log.getStackTraceString(exception5)));
                                }
                            }
                            reply.g(d11);
                            return;
                    }
                }
            });
        }
    }
}
