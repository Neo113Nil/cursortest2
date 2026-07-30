package com.google.firebase.encoders;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public interface ValueEncoderContext {
    ValueEncoderContext add(double d);

    ValueEncoderContext add(float f);

    ValueEncoderContext add(int i);

    ValueEncoderContext add(long j);

    ValueEncoderContext add(String str);

    ValueEncoderContext add(boolean z);

    ValueEncoderContext add(byte[] bArr);
}
