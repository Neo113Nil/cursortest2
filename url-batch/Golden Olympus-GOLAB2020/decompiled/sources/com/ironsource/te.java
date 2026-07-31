package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public enum te {
    SendEvent(0),
    NativeController(1);


    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f19746b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f19750a;

    @Metadata
    public static final class a {
        private a() {
        }

        @NotNull
        public final te a(int i4) {
            te teVar;
            te[] values = te.values();
            int length = values.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    teVar = null;
                    break;
                }
                teVar = values[i5];
                if (teVar.b() == i4) {
                    break;
                }
                i5++;
            }
            return teVar == null ? te.SendEvent : teVar;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    te(int i4) {
        this.f19750a = i4;
    }

    public final int b() {
        return this.f19750a;
    }
}
