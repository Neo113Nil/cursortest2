package com.yandex.mobile.ads.impl;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import com.yandex.div.core.DivConfiguration;
import com.yandex.div.core.view2.Div2View;
import com.yandex.mobile.ads.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class o20 implements qp {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final f61 f29870a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final mr f29871b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final mp1 f29872c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final w20 f29873d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final c30 f29874e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private Dialog f29875f;

    public o20(@NotNull f61 nativeAdPrivate, @NotNull mr contentCloseListener, @NotNull mp1 reporter, @NotNull w20 divKitDesignProvider, @NotNull c30 divViewCreator) {
        Intrinsics.checkNotNullParameter(nativeAdPrivate, "nativeAdPrivate");
        Intrinsics.checkNotNullParameter(contentCloseListener, "contentCloseListener");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(divKitDesignProvider, "divKitDesignProvider");
        Intrinsics.checkNotNullParameter(divViewCreator, "divViewCreator");
        this.f29870a = nativeAdPrivate;
        this.f29871b = contentCloseListener;
        this.f29872c = reporter;
        this.f29873d = divKitDesignProvider;
        this.f29874e = divViewCreator;
    }

    @Override // com.yandex.mobile.ads.impl.qp
    public final void a() {
        Dialog dialog = this.f29875f;
        if (dialog != null) {
            c10.a(dialog);
        }
    }

    @Override // com.yandex.mobile.ads.impl.qp
    public final void a(@NotNull Context context) {
        q20 q20Var;
        Object obj;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            w20 w20Var = this.f29873d;
            f61 nativeAdPrivate = this.f29870a;
            w20Var.getClass();
            Intrinsics.checkNotNullParameter(nativeAdPrivate, "nativeAdPrivate");
            List<q20> c4 = nativeAdPrivate.c();
            if (c4 != null) {
                Iterator<T> it = c4.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (Intrinsics.areEqual(((q20) obj).e(), w00.f33853e.a())) {
                            break;
                        }
                    }
                }
                q20Var = (q20) obj;
            } else {
                q20Var = null;
            }
            if (q20Var == null) {
                this.f29871b.f();
                return;
            }
            p20 p20Var = new p20(context, null);
            c30 c30Var = this.f29874e;
            DivConfiguration a4 = p20Var.a();
            Intrinsics.checkNotNullExpressionValue(a4, "<get-divConfiguration>(...)");
            c30Var.getClass();
            Div2View a5 = c30.a(context, a4, null);
            Dialog dialog = new Dialog(context, R.style.MonetizationAdsInternal_FullscreenDialog);
            dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.yandex.mobile.ads.impl.Eb
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    o20.a(o20.this, dialogInterface);
                }
            });
            a5.setActionHandler(new pp(new op(dialog, this.f29871b)));
            a5.setData(q20Var.b(), q20Var.c());
            dialog.setContentView(a5);
            this.f29875f = dialog;
            dialog.show();
        } catch (Throwable th) {
            this.f29872c.reportError("Failed to show DivKit close dialog", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(o20 this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f29875f = null;
    }
}
