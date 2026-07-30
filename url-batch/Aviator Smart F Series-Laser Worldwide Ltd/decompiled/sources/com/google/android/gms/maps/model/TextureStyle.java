package com.google.android.gms.maps.model;

import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.StampStyle;

/* loaded from: classes3.dex */
public class TextureStyle extends StampStyle {

    public static final class Builder extends StampStyle.Builder<Builder> {
        private Builder() {
            throw null;
        }

        @NonNull
        public TextureStyle build() {
            return new TextureStyle(this.zza, null);
        }

        @Override // com.google.android.gms.maps.model.StampStyle.Builder
        @NonNull
        protected final /* bridge */ /* synthetic */ Builder self() {
            return this;
        }

        /* synthetic */ Builder(zzaf zzafVar) {
        }

        @Override // com.google.android.gms.maps.model.StampStyle.Builder
        @NonNull
        /* renamed from: self, reason: avoid collision after fix types in other method */
        protected Builder self2() {
            return this;
        }
    }

    /* synthetic */ TextureStyle(BitmapDescriptor bitmapDescriptor, zzag zzagVar) {
        super(bitmapDescriptor);
    }

    @NonNull
    public static Builder newBuilder(@NonNull BitmapDescriptor bitmapDescriptor) {
        return new Builder(null).stamp(bitmapDescriptor);
    }
}
