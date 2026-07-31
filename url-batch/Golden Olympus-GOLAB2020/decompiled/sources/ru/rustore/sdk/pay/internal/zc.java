package ru.rustore.sdk.pay.internal;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class zc extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.p f45336a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fd f45337b;

    /* JADX WARN: Multi-variable type inference failed */
    public zc(Function0<Unit> function0, fd fdVar) {
        this.f45336a = (kotlin.jvm.internal.p) function0;
        this.f45337b = fdVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.p] */
    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        Intrinsics.checkNotNullParameter(widget, "widget");
        this.f45336a.invoke();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        super.updateDrawState(ds);
        ds.setColor(((Number) this.f45337b.f44100f0.getValue()).intValue());
        ds.setUnderlineText(false);
    }
}
