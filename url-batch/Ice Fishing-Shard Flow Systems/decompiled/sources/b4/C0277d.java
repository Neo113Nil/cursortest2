package b4;

import A.j;
import D6.z;
import O6.g;
import android.app.Activity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m1.C0686a;
import p4.InterfaceC0828a;
import r4.l;
import s4.n;
import s4.o;
import s4.p;
import s4.q;

@Metadata
/* renamed from: b4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0277d implements o4.c, InterfaceC0828a, o {

    /* renamed from: d, reason: collision with root package name */
    public Activity f4156d;

    @Override // p4.InterfaceC0828a
    public final void onAttachedToActivity(p4.b binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f4156d = (Activity) ((z) binding).f640c;
    }

    @Override // o4.c
    public final void onAttachedToEngine(o4.b binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        new q(binding.f7122c, "advertising_id").b(this);
    }

    @Override // o4.c
    public final void onDetachedFromEngine(o4.b binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
    }

    @Override // s4.o
    public final void onMethodCall(n call, p result) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        final Activity activity = this.f4156d;
        if (activity == null) {
            ((l) result).error("noActivity", "Activity is null", null);
            return;
        }
        String str = call.f7767a;
        if (Intrinsics.a(str, "getAdvertisingId")) {
            final l lVar = (l) result;
            final int i2 = 0;
            g.a0(new Function0() { // from class: b4.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i2) {
                        case 0:
                            Activity activity2 = activity;
                            final l lVar2 = lVar;
                            try {
                                activity2.runOnUiThread(new j(lVar2, 14, C0686a.a(activity2).f5108b));
                            } catch (Exception e7) {
                                final int i5 = 1;
                                activity2.runOnUiThread(new Runnable() { // from class: b4.c
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i5) {
                                            case 0:
                                                Exception exc = e7;
                                                lVar2.error(exc.getClass().getCanonicalName(), exc.getLocalizedMessage(), null);
                                                break;
                                            default:
                                                Exception exc2 = e7;
                                                lVar2.error(exc2.getClass().getCanonicalName(), exc2.getLocalizedMessage(), null);
                                                break;
                                        }
                                    }
                                });
                            }
                            break;
                        default:
                            Activity activity3 = activity;
                            final l lVar3 = lVar;
                            try {
                                final boolean z7 = C0686a.a(activity3).f5109c;
                                activity3.runOnUiThread(new Runnable() { // from class: b4.b
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        l.this.success(Boolean.valueOf(z7));
                                    }
                                });
                            } catch (Exception e8) {
                                final int i7 = 0;
                                activity3.runOnUiThread(new Runnable() { // from class: b4.c
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i7) {
                                            case 0:
                                                Exception exc = e8;
                                                lVar3.error(exc.getClass().getCanonicalName(), exc.getLocalizedMessage(), null);
                                                break;
                                            default:
                                                Exception exc2 = e8;
                                                lVar3.error(exc2.getClass().getCanonicalName(), exc2.getLocalizedMessage(), null);
                                                break;
                                        }
                                    }
                                });
                            }
                            break;
                    }
                    return Unit.f6114a;
                }
            });
        } else if (!Intrinsics.a(str, "isLimitAdTrackingEnabled")) {
            ((l) result).notImplemented();
            Unit unit = Unit.f6114a;
        } else {
            final l lVar2 = (l) result;
            final int i5 = 1;
            g.a0(new Function0() { // from class: b4.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i5) {
                        case 0:
                            Activity activity2 = activity;
                            final l lVar22 = lVar2;
                            try {
                                activity2.runOnUiThread(new j(lVar22, 14, C0686a.a(activity2).f5108b));
                            } catch (Exception e7) {
                                final int i52 = 1;
                                activity2.runOnUiThread(new Runnable() { // from class: b4.c
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i52) {
                                            case 0:
                                                Exception exc = e7;
                                                lVar22.error(exc.getClass().getCanonicalName(), exc.getLocalizedMessage(), null);
                                                break;
                                            default:
                                                Exception exc2 = e7;
                                                lVar22.error(exc2.getClass().getCanonicalName(), exc2.getLocalizedMessage(), null);
                                                break;
                                        }
                                    }
                                });
                            }
                            break;
                        default:
                            Activity activity3 = activity;
                            final l lVar3 = lVar2;
                            try {
                                final boolean z7 = C0686a.a(activity3).f5109c;
                                activity3.runOnUiThread(new Runnable() { // from class: b4.b
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        l.this.success(Boolean.valueOf(z7));
                                    }
                                });
                            } catch (Exception e8) {
                                final int i7 = 0;
                                activity3.runOnUiThread(new Runnable() { // from class: b4.c
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i7) {
                                            case 0:
                                                Exception exc = e8;
                                                lVar3.error(exc.getClass().getCanonicalName(), exc.getLocalizedMessage(), null);
                                                break;
                                            default:
                                                Exception exc2 = e8;
                                                lVar3.error(exc2.getClass().getCanonicalName(), exc2.getLocalizedMessage(), null);
                                                break;
                                        }
                                    }
                                });
                            }
                            break;
                    }
                    return Unit.f6114a;
                }
            });
        }
    }

    @Override // p4.InterfaceC0828a
    public final void onReattachedToActivityForConfigChanges(p4.b binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
    }

    @Override // p4.InterfaceC0828a
    public final void onDetachedFromActivity() {
    }

    @Override // p4.InterfaceC0828a
    public final void onDetachedFromActivityForConfigChanges() {
    }
}
