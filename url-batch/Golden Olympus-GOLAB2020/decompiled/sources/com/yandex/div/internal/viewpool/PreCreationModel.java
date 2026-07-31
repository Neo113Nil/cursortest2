package com.yandex.div.internal.viewpool;

import A2.f;
import B2.d;
import C2.AbstractC0341w0;
import C2.H0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y2.InterfaceC3527b;
import y2.InterfaceC3533h;

@InterfaceC3533h
@Metadata
/* loaded from: classes2.dex */
public final class PreCreationModel {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private final int capacity;
    private final int max;
    private final int min;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final InterfaceC3527b serializer() {
            return PreCreationModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public PreCreationModel(int i4, int i5, int i6) {
        this.capacity = i4;
        this.min = i5;
        this.max = i6;
    }

    public static final /* synthetic */ void write$Self(PreCreationModel preCreationModel, d dVar, f fVar) {
        dVar.f(fVar, 0, preCreationModel.capacity);
        if (dVar.r(fVar, 1) || preCreationModel.min != 0) {
            dVar.f(fVar, 1, preCreationModel.min);
        }
        if (!dVar.r(fVar, 2) && preCreationModel.max == Integer.MAX_VALUE) {
            return;
        }
        dVar.f(fVar, 2, preCreationModel.max);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreCreationModel)) {
            return false;
        }
        PreCreationModel preCreationModel = (PreCreationModel) obj;
        return this.capacity == preCreationModel.capacity && this.min == preCreationModel.min && this.max == preCreationModel.max;
    }

    public final int getCapacity() {
        return this.capacity;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.capacity) * 31) + Integer.hashCode(this.min)) * 31) + Integer.hashCode(this.max);
    }

    @NotNull
    public String toString() {
        return "PreCreationModel(capacity=" + this.capacity + ", min=" + this.min + ", max=" + this.max + ')';
    }

    public /* synthetic */ PreCreationModel(int i4, int i5, int i6, int i7, H0 h02) {
        if (1 != (i4 & 1)) {
            AbstractC0341w0.a(i4, 1, PreCreationModel$$serializer.INSTANCE.getDescriptor());
        }
        this.capacity = i5;
        if ((i4 & 2) == 0) {
            this.min = 0;
        } else {
            this.min = i6;
        }
        if ((i4 & 4) == 0) {
            this.max = Integer.MAX_VALUE;
        } else {
            this.max = i7;
        }
    }

    public /* synthetic */ PreCreationModel(int i4, int i5, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(i4, (i7 & 2) != 0 ? 0 : i5, (i7 & 4) != 0 ? Integer.MAX_VALUE : i6);
    }
}
