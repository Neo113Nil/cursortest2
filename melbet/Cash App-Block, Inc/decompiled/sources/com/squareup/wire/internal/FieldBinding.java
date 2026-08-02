package com.squareup.wire.internal;

import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda3;
import com.squareup.wire.KotlinConstructorBuilder;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireField;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.reflect.KClass;
import kotlin.text.Regex;
import papa.PapaEvent;

/* loaded from: classes8.dex */
public final class FieldBinding extends FieldOrOneOfBinding {
    public static final Regex IS_GETTER_FIELD_NAME_REGEX = new Regex("^is[^a-z].*$");
    public final String adapterString;
    public final Function1 builderGetter;
    public final Function2 builderSetter;
    public final ClassLoader classLoader;
    public final String declaredName;
    public final Function1 instanceGetter;
    public final String keyAdapterString;
    public final WireField.Label label;
    public final Field messageField;
    public final String name;
    public final boolean redacted;
    public final int tag;
    public final String wireFieldJsonName;

    public FieldBinding(WireField wireField, Class cls, Field field, Class cls2, ClassLoader classLoader) {
        String declaredName;
        FieldBinding$$ExternalSyntheticLambda5 fieldBinding$$ExternalSyntheticLambda5;
        Function2 function2;
        AlertBannerKt$$ExternalSyntheticLambda3 alertBannerKt$$ExternalSyntheticLambda3;
        AlertBannerKt$$ExternalSyntheticLambda3 alertBannerKt$$ExternalSyntheticLambda32;
        cls.getClass();
        this.messageField = field;
        this.classLoader = classLoader;
        this.label = wireField.label();
        String name = field.getName();
        name.getClass();
        this.name = name;
        this.wireFieldJsonName = wireField.jsonName();
        if (wireField.declaredName().length() == 0) {
            declaredName = field.getName();
            declaredName.getClass();
        } else {
            declaredName = wireField.declaredName();
        }
        this.declaredName = declaredName;
        this.tag = wireField.tag();
        this.keyAdapterString = wireField.keyAdapter();
        this.adapterString = wireField.adapter();
        this.redacted = wireField.redacted();
        if (cls2.isAssignableFrom(KotlinConstructorBuilder.class)) {
            function2 = new FieldBinding$$ExternalSyntheticLambda4(wireField, 0);
        } else {
            WireField.Label label = wireField.label();
            label.getClass();
            if (label == WireField.Label.ONE_OF) {
                Class<?> type2 = field.getType();
                try {
                    fieldBinding$$ExternalSyntheticLambda5 = new FieldBinding$$ExternalSyntheticLambda5(cls2.getMethod(name, type2), 0);
                } catch (NoSuchMethodException unused) {
                    throw new AssertionError("No builder method " + cls2.getName() + '.' + name + '(' + type2.getName() + ')');
                }
            } else {
                try {
                    fieldBinding$$ExternalSyntheticLambda5 = new FieldBinding$$ExternalSyntheticLambda5(cls2.getField(name), 1);
                } catch (NoSuchFieldException unused2) {
                    throw new AssertionError("No builder field " + cls2.getName() + '.' + name);
                }
            }
            function2 = fieldBinding$$ExternalSyntheticLambda5;
        }
        this.builderSetter = function2;
        if (cls2.isAssignableFrom(KotlinConstructorBuilder.class)) {
            alertBannerKt$$ExternalSyntheticLambda3 = new AlertBannerKt$$ExternalSyntheticLambda3(wireField, 22);
        } else {
            try {
                alertBannerKt$$ExternalSyntheticLambda3 = new AlertBannerKt$$ExternalSyntheticLambda3(cls2.getField(name), 23);
            } catch (NoSuchFieldException unused3) {
                throw new AssertionError("No builder field " + cls2.getName() + '.' + name);
            }
        }
        this.builderGetter = alertBannerKt$$ExternalSyntheticLambda3;
        if (Modifier.isPrivate(field.getModifiers())) {
            String name2 = field.getName();
            name2.getClass();
            if (!IS_GETTER_FIELD_NAME_REGEX.matches(name2)) {
                if (name2.length() > 0) {
                    StringBuilder sb = new StringBuilder();
                    String valueOf = String.valueOf(name2.charAt(0));
                    valueOf.getClass();
                    String upperCase = valueOf.toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    sb.append((Object) upperCase);
                    sb.append(name2.substring(1));
                    name2 = sb.toString();
                }
                name2 = "get".concat(name2);
            }
            alertBannerKt$$ExternalSyntheticLambda32 = new AlertBannerKt$$ExternalSyntheticLambda3(cls.getMethod(name2, null), 24);
        } else {
            alertBannerKt$$ExternalSyntheticLambda32 = new AlertBannerKt$$ExternalSyntheticLambda3(this, 25);
        }
        this.instanceGetter = alertBannerKt$$ExternalSyntheticLambda32;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public final Object get(Object obj) {
        Message message = (Message) obj;
        message.getClass();
        return this.instanceGetter.invoke(message);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public final String getDeclaredName() {
        return this.declaredName;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public final Object getFromBuilder$1(Message.Builder builder) {
        builder.getClass();
        return this.builderGetter.invoke(builder);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public final ProtoAdapter getKeyAdapter() {
        ProtoAdapter.Companion.getClass();
        return ProtoAdapter.Companion.get(this.keyAdapterString, this.classLoader);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public final WireField.Label getLabel() {
        return this.label;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public final String getName() {
        return this.name;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public final boolean getRedacted() {
        return this.redacted;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public final ProtoAdapter getSingleAdapter() {
        ProtoAdapter.Companion.getClass();
        return ProtoAdapter.Companion.get(this.adapterString, this.classLoader);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public final int getTag() {
        return this.tag;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public final String getWireFieldJsonName() {
        return this.wireFieldJsonName;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public final boolean getWriteIdentityValues() {
        return false;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public final boolean isMap() {
        return this.keyAdapterString.length() > 0;
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public final boolean isMessage() {
        KClass type2 = getSingleAdapter().getType();
        Class javaObjectType = type2 != null ? PapaEvent.getJavaObjectType(type2) : null;
        javaObjectType.getClass();
        return Message.class.isAssignableFrom(javaObjectType);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public final void set$1(Message.Builder builder, Object obj) {
        builder.getClass();
        this.builderSetter.invoke(builder, obj);
    }

    @Override // com.squareup.wire.internal.FieldOrOneOfBinding
    public final void value(Message.Builder builder, Object obj) {
        builder.getClass();
        boolean isRepeated = this.label.isRepeated();
        Function1 function1 = this.builderGetter;
        Function2 function2 = this.builderSetter;
        if (!isRepeated) {
            if (this.keyAdapterString.length() <= 0) {
                function2.invoke(builder, obj);
                return;
            }
            Object invoke = function1.invoke(builder);
            if (TypeIntrinsics.isMutableMap(invoke)) {
                ((Map) invoke).putAll((Map) obj);
                return;
            }
            if (invoke instanceof Map) {
                LinkedHashMap linkedHashMap = new LinkedHashMap((Map) invoke);
                linkedHashMap.putAll((Map) obj);
                function2.invoke(builder, linkedHashMap);
                return;
            } else {
                throw new ClassCastException("Expected a map type, got " + (invoke != null ? invoke.getClass() : null) + '.');
            }
        }
        Object invoke2 = function1.invoke(builder);
        boolean z = invoke2 instanceof List;
        if (z && (!(invoke2 instanceof KMappedMarker) || (invoke2 instanceof KMutableList))) {
            invoke2.getClass();
            TypeIntrinsics.asMutableList(invoke2).add(obj);
        } else if (z) {
            ArrayList arrayList = new ArrayList((Collection) invoke2);
            arrayList.add(obj);
            function2.invoke(builder, arrayList);
        } else {
            throw new ClassCastException("Expected a list type, got " + (invoke2 != null ? invoke2.getClass() : null) + '.');
        }
    }
}
