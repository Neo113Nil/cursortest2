package com.squareup.wire.internal;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda0;
import kotlin.Lazy;
import kotlin.LazyKt;

/* loaded from: classes8.dex */
public abstract class FieldOrOneOfBinding {
    public final Lazy adapter$delegate = LazyKt.lazy(new HCaptcha$$ExternalSyntheticLambda0(this, 6));

    public abstract Object get(Object obj);

    public final ProtoAdapter getAdapter() {
        return (ProtoAdapter) this.adapter$delegate.getValue();
    }

    public abstract String getDeclaredName();

    public abstract Object getFromBuilder$1(Message.Builder builder);

    public abstract ProtoAdapter getKeyAdapter();

    public abstract WireField.Label getLabel();

    public abstract String getName();

    public abstract boolean getRedacted();

    public abstract ProtoAdapter getSingleAdapter();

    public abstract int getTag();

    public abstract String getWireFieldJsonName();

    public abstract boolean getWriteIdentityValues();

    public abstract boolean isMap();

    public abstract boolean isMessage();

    public abstract void set$1(Message.Builder builder, Object obj);

    public abstract void value(Message.Builder builder, Object obj);
}
