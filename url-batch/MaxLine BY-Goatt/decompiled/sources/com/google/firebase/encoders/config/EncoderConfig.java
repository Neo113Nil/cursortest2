package com.google.firebase.encoders.config;

import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.config.EncoderConfig;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public interface EncoderConfig<T extends EncoderConfig<T>> {
    <U> T registerEncoder(Class<U> cls, ObjectEncoder<? super U> objectEncoder);

    <U> T registerEncoder(Class<U> cls, ValueEncoder<? super U> valueEncoder);
}
