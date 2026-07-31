package com.ironsource;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.webkit.WebView;
import com.ironsource.wk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class lk extends WebView implements xk {

    /* renamed from: a, reason: collision with root package name */
    private wk f17095a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private to f17096b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a() {
        this.f17096b = null;
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, @NotNull KeyEvent event) {
        to toVar;
        Intrinsics.checkNotNullParameter(event, "event");
        if (i4 == 4 && (toVar = this.f17096b) != null && toVar.onBackButtonPressed()) {
            return true;
        }
        return super.onKeyDown(i4, event);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    public final void a(@Nullable to toVar) {
        this.f17096b = toVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lk(@NotNull Context context, @NotNull AttributeSet attrs, int i4) {
        super(context, attrs, i4);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
    }

    @Override // com.ironsource.xk
    public void a(@NotNull String script) {
        Intrinsics.checkNotNullParameter(script, "script");
        wk wkVar = this.f17095a;
        wk wkVar2 = null;
        if (wkVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("javascriptEngine");
            wkVar = null;
        }
        if (!wkVar.a()) {
            wk wkVar3 = this.f17095a;
            if (wkVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("javascriptEngine");
                wkVar3 = null;
            }
            wkVar3.a(this);
        }
        wk wkVar4 = this.f17095a;
        if (wkVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("javascriptEngine");
        } else {
            wkVar2 = wkVar4;
        }
        wkVar2.a(script);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public lk(@NotNull Context context, @NotNull wk javascriptEngine) {
        this(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(javascriptEngine, "javascriptEngine");
        this.f17095a = javascriptEngine;
    }

    public /* synthetic */ lk(Context context, wk wkVar, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i4 & 2) != 0 ? new wk.a(0, 1, null) : wkVar);
    }
}
