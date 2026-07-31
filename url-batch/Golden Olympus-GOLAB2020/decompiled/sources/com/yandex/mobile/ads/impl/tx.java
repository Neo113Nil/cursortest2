package com.yandex.mobile.ads.impl;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.features.debugpanel.ui.IntegrationInspectorActivity;
import com.yandex.mobile.ads.impl.sx;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class tx {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final IntegrationInspectorActivity f32721a;

    static final class a extends kotlin.jvm.internal.s implements Function0<Unit> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            y01.f34757a.b();
            tx txVar = tx.this;
            String string = txVar.f32721a.getString(R.string.logging_is_enabled);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            tx.a(txVar, string);
            return Unit.f41027a;
        }
    }

    public tx(@NotNull IntegrationInspectorActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f32721a = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(DialogInterface dialogInterface, int i4) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(DialogInterface dialogInterface, int i4) {
    }

    public static final void a(tx txVar, String str) {
        Toast.makeText(txVar.f32721a, str, 0).show();
    }

    public final void a(@NotNull sx event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof sx.c) {
            Toast.makeText(this.f32721a, ((sx.c) event).a(), 0).show();
            return;
        }
        if (event instanceof sx.e) {
            a(((sx.e) event).a());
            return;
        }
        if (event instanceof sx.d) {
            Uri a4 = ((sx.d) event).a();
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.STREAM", a4);
            intent.setType("text/plain");
            this.f32721a.startActivity(intent);
            return;
        }
        if (event instanceof sx.b) {
            String string = this.f32721a.getString(R.string.logging_is_disabled);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = this.f32721a.getString(R.string.do_you_want_to_enable_logging);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            a(string, string2, new a());
            return;
        }
        if (event instanceof sx.a) {
            this.f32721a.finishAfterTransition();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Function0 function0, DialogInterface dialogInterface, int i4) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    private final void a(String str) {
        new AlertDialog.Builder(this.f32721a).setMessage(str).setPositiveButton(this.f32721a.getString(R.string.ok), new DialogInterface.OnClickListener() { // from class: com.yandex.mobile.ads.impl.Oe
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                tx.b(dialogInterface, i4);
            }
        }).show();
    }

    private final void a(String str, String str2, final Function0<Unit> function0) {
        new AlertDialog.Builder(this.f32721a).setTitle(str).setMessage(str2).setPositiveButton(this.f32721a.getString(R.string.yes), new DialogInterface.OnClickListener() { // from class: com.yandex.mobile.ads.impl.Me
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                tx.a(Function0.this, dialogInterface, i4);
            }
        }).setNegativeButton(this.f32721a.getString(R.string.no), new DialogInterface.OnClickListener() { // from class: com.yandex.mobile.ads.impl.Ne
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                tx.a(dialogInterface, i4);
            }
        }).show();
    }
}
