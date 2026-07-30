package com.facebook.internal;

import com.facebook.FacebookException;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class CollectionMapper {

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public interface Collection<T> {
        Object get(T t);

        Iterator<T> keyIterator();

        void set(T t, Object obj, OnErrorListener onErrorListener);
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public interface OnErrorListener {
        void onError(FacebookException facebookException);
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public interface OnMapValueCompleteListener extends OnErrorListener {
        void onComplete(Object obj);
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public interface OnMapperCompleteListener extends OnErrorListener {
        void onComplete();
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public interface ValueMapper {
        void mapValue(Object obj, OnMapValueCompleteListener onMapValueCompleteListener);
    }

    private CollectionMapper() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void iterate(final Collection<T> collection, ValueMapper valueMapper, final OnMapperCompleteListener onMapperCompleteListener) {
        final Mutable mutable = new Mutable(Boolean.FALSE);
        final Mutable mutable2 = new Mutable(1);
        final OnMapperCompleteListener onMapperCompleteListener2 = new OnMapperCompleteListener() { // from class: com.facebook.internal.CollectionMapper.1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Integer] */
            @Override // com.facebook.internal.CollectionMapper.OnMapperCompleteListener
            public void onComplete() {
                if (((Boolean) Mutable.this.value).booleanValue()) {
                    return;
                }
                Mutable mutable3 = mutable2;
                int intValue = ((Integer) mutable3.value).intValue() - 1;
                mutable3.value = Integer.valueOf(intValue);
                if (intValue == 0) {
                    onMapperCompleteListener.onComplete();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.Boolean] */
            @Override // com.facebook.internal.CollectionMapper.OnErrorListener
            public void onError(FacebookException facebookException) {
                if (((Boolean) Mutable.this.value).booleanValue()) {
                    return;
                }
                Mutable.this.value = Boolean.TRUE;
                onMapperCompleteListener.onError(facebookException);
            }
        };
        Iterator keyIterator = collection.keyIterator();
        LinkedList linkedList = new LinkedList();
        while (keyIterator.hasNext()) {
            linkedList.add(keyIterator.next());
        }
        for (final Object obj : linkedList) {
            Object obj2 = collection.get(obj);
            OnMapValueCompleteListener onMapValueCompleteListener = new OnMapValueCompleteListener() { // from class: com.facebook.internal.CollectionMapper.2
                @Override // com.facebook.internal.CollectionMapper.OnMapValueCompleteListener
                public void onComplete(Object obj3) {
                    Collection.this.set(obj, obj3, onMapperCompleteListener2);
                    onMapperCompleteListener2.onComplete();
                }

                @Override // com.facebook.internal.CollectionMapper.OnErrorListener
                public void onError(FacebookException facebookException) {
                    onMapperCompleteListener2.onError(facebookException);
                }
            };
            T t = mutable2.value;
            mutable2.value = (T) Integer.valueOf(((Integer) t).intValue() + 1);
            valueMapper.mapValue(obj2, onMapValueCompleteListener);
        }
        onMapperCompleteListener2.onComplete();
    }
}
