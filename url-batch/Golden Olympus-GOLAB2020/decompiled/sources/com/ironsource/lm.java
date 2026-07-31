package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class lm extends hp {

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public static final a f17099d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final String f17100e = "ManualTrigger";

    @Metadata
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public lm() {
        this(false, 1, null);
    }

    @Override // com.ironsource.hp
    @NotNull
    public String b() {
        return f17100e;
    }

    public final void e() {
        a(true);
    }

    public final void f() {
        a(false);
    }

    public lm(boolean z4) {
        super(z4);
    }

    public /* synthetic */ lm(boolean z4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? false : z4);
    }
}
