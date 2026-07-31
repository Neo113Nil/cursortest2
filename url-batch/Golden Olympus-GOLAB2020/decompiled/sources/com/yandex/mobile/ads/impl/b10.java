package com.yandex.mobile.ads.impl;

import android.app.Dialog;
import android.content.DialogInterface;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class b10 implements mr {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private Dialog f23543a;

    public final void a(@NotNull Dialog dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        this.f23543a = dialog;
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.yandex.mobile.ads.impl.X
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                b10.a(b10.this, dialogInterface);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.mr
    public final void f() {
        Dialog dialog = this.f23543a;
        if (dialog != null) {
            c10.a(dialog);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(b10 this$0, DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Dialog dialog = this$0.f23543a;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
        }
        this$0.f23543a = null;
    }
}
