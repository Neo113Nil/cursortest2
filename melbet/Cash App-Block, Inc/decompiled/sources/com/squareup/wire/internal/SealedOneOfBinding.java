package com.squareup.wire.internal;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.wire.KotlinConstructorBuilder;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import com.squareup.wire.WireOneofField;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.reflect.KClass;
import papa.PapaEvent;

/* loaded from: classes8.dex */
public final class SealedOneOfBinding extends FieldOrOneOfBinding {
    public final WireOneofField annotation;
    public final Field builderField;
    public final boolean isKotlinConstructorBuilder;
    public final Field messageField;
    public final ProtoAdapter singleAdapter;
    public final Class subclassType;
    public final Lazy valueField$delegate;

    public SealedOneOfBinding(Field field, Class cls, WireOneofField wireOneofField, Class cls2, ClassLoader classLoader) {
        Field declaredField;
        wireOneofField.getClass();
        cls2.getClass();
        this.messageField = field;
        this.annotation = wireOneofField;
        this.subclassType = cls2;
        field.setAccessible(true);
        boolean equals = cls.equals(KotlinConstructorBuilder.class);
        this.isKotlinConstructorBuilder = equals;
        if (equals) {
            declaredField = null;
        } else {
            declaredField = cls.getDeclaredField(field.getName());
            declaredField.setAccessible(true);
        }
        this.builderField = declaredField;
        ProtoAdapter.Companion companion = ProtoAdapter.Companion;
        String adapter = wireOneofField.adapter();
        companion.getClass();
        this.singleAdapter = ProtoAdapter.Companion.get(adapter, classLoader);
        this.valueField$delegate = LazyKt.lazy(new HCaptcha$$ExternalSyntheticLambda0(this, 7));
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public final Object get(Object obj) {
        Message message = (Message) obj;
        message.getClass();
        Object obj2 = this.messageField.get(message);
        if (obj2 == null || !this.subclassType.isInstance(obj2)) {
            return null;
        }
        Object value = this.valueField$delegate.getValue();
        value.getClass();
        return ((Field) value).get(obj2);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public final String getDeclaredName() {
        return this.annotation.declaredName();
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public final Object getFromBuilder$1(Message.Builder builder) {
        Object obj;
        builder.getClass();
        if (this.isKotlinConstructorBuilder) {
            String name = this.messageField.getName();
            name.getClass();
            obj = ((KotlinConstructorBuilder) builder).sealedOneofValues.get(name);
        } else {
            Field field = this.builderField;
            field.getClass();
            obj = field.get(builder);
        }
        if (obj == null || !this.subclassType.isInstance(obj)) {
            return null;
        }
        Object value = this.valueField$delegate.getValue();
        value.getClass();
        return ((Field) value).get(obj);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public final ProtoAdapter getKeyAdapter() {
        throw new IllegalStateException("not a map");
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public final WireField.Label getLabel() {
        return WireField.Label.OPTIONAL;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public final String getName() {
        return this.annotation.declaredName();
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public final boolean getRedacted() {
        return this.annotation.redacted();
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public final ProtoAdapter getSingleAdapter() {
        return this.singleAdapter;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public final int getTag() {
        return this.annotation.tag();
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public final String getWireFieldJsonName() {
        return this.annotation.jsonName();
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public final boolean getWriteIdentityValues() {
        return false;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public final boolean isMap() {
        return false;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public final boolean isMessage() {
        KClass type2 = this.singleAdapter.getType();
        return Message.class.isAssignableFrom(type2 != null ? PapaEvent.getJavaObjectType(type2) : null);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    /* renamed from: set, reason: merged with bridge method [inline-methods] */
    public final void set$1(Message.Builder builder, Object obj) {
        builder.getClass();
        if (obj == null) {
            return;
        }
        Constructor<?>[] declaredConstructors = this.subclassType.getDeclaredConstructors();
        declaredConstructors.getClass();
        for (Constructor<?> constructor : declaredConstructors) {
            if (constructor.getParameterCount() == 1) {
                constructor.setAccessible(true);
                Object newInstance = constructor.newInstance(obj);
                if (this.isKotlinConstructorBuilder) {
                    String name = this.messageField.getName();
                    name.getClass();
                    ((KotlinConstructorBuilder) builder).sealedOneofValues.put(name, newInstance);
                    return;
                } else {
                    Field field = this.builderField;
                    field.getClass();
                    field.set(builder, newInstance);
                    return;
                }
            }
        }
        OptionalProvider$$ExternalSyntheticLambda0.m("Array contains no element matching the predicate.");
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public final void value(Message.Builder builder, Object obj) {
        builder.getClass();
        set$1(builder, obj);
    }
}
