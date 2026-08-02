package com.squareup.wire;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.Array;
import kotlin.reflect.KClass;
import okio.ByteString;
import papa.PapaEvent;

/* loaded from: classes.dex */
public abstract class AndroidMessage extends Message implements Parcelable {
    public static final Companion Companion = new Companion();

    public final class Companion {
    }

    public final class ProtoAdapterCreator implements Parcelable.Creator {
        public final ProtoAdapter adapter;

        public ProtoAdapterCreator(ProtoAdapter protoAdapter) {
            protoAdapter.getClass();
            this.adapter = protoAdapter;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            byte[] createByteArray = parcel.createByteArray();
            createByteArray.getClass();
            return this.adapter.decode(createByteArray);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            KClass type2 = this.adapter.getType();
            Object newInstance = Array.newInstance((Class<?>) (type2 != null ? PapaEvent.getJavaObjectType(type2) : null), i);
            newInstance.getClass();
            return (Object[]) newInstance;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidMessage(ProtoAdapter protoAdapter, ByteString byteString) {
        super(protoAdapter, byteString);
        protoAdapter.getClass();
        byteString.getClass();
    }

    public static final <E> Parcelable.Creator<E> newCreator(ProtoAdapter protoAdapter) {
        Companion.getClass();
        protoAdapter.getClass();
        return new ProtoAdapterCreator(protoAdapter);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeByteArray(encode());
    }
}
