package com.google.firebase.encoders;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public interface ObjectEncoderContext {
    ObjectEncoderContext add(FieldDescriptor fieldDescriptor, double d);

    ObjectEncoderContext add(FieldDescriptor fieldDescriptor, float f);

    ObjectEncoderContext add(FieldDescriptor fieldDescriptor, int i);

    ObjectEncoderContext add(FieldDescriptor fieldDescriptor, long j);

    ObjectEncoderContext add(FieldDescriptor fieldDescriptor, Object obj);

    ObjectEncoderContext add(FieldDescriptor fieldDescriptor, boolean z);

    @Deprecated
    ObjectEncoderContext add(String str, double d);

    @Deprecated
    ObjectEncoderContext add(String str, int i);

    @Deprecated
    ObjectEncoderContext add(String str, long j);

    @Deprecated
    ObjectEncoderContext add(String str, Object obj);

    @Deprecated
    ObjectEncoderContext add(String str, boolean z);

    ObjectEncoderContext inline(Object obj);

    ObjectEncoderContext nested(FieldDescriptor fieldDescriptor);

    ObjectEncoderContext nested(String str);
}
