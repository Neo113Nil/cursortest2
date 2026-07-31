package com.yandex.div.data;

import O1.C0802f;
import O1.C0981p;
import O1.C1141xg;
import O1.C1160z;
import O1.Ig;
import O1.U;
import O1.ch;
import O1.mh;
import W1.m;
import android.net.Uri;
import com.yandex.div.core.ObserverList;
import com.yandex.div.evaluable.types.Color;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.util.ConvertUtilsKt;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.expressions.Expression;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public abstract class Variable {

    @NotNull
    private final ObserverList<Function1<Variable, Unit>> observers;

    @Metadata
    public static class ArrayVariable extends Variable {

        @NotNull
        private final JSONArray defaultValue;

        @NotNull
        private final String name;

        @NotNull
        private JSONArray value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ArrayVariable(@NotNull String name, @NotNull JSONArray defaultValue) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
            this.name = name;
            this.defaultValue = defaultValue;
            this.value = getDefaultValue();
        }

        @NotNull
        public JSONArray getDefaultValue() {
            return this.defaultValue;
        }

        @Override // com.yandex.div.data.Variable
        @NotNull
        public String getName() {
            return this.name;
        }

        @NotNull
        public JSONArray getValue$div_data_release() {
            return this.value;
        }

        public void set(@NotNull JSONArray newValue) {
            Intrinsics.checkNotNullParameter(newValue, "newValue");
            setValue$div_data_release(newValue);
        }

        public void setValue$div_data_release(@NotNull JSONArray value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (Intrinsics.areEqual(this.value, value)) {
                return;
            }
            this.value = value;
            notifyVariableChanged(this);
        }
    }

    @Metadata
    public static class BooleanVariable extends Variable {
        private final boolean defaultValue;

        @NotNull
        private final String name;
        private boolean value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BooleanVariable(@NotNull String name, boolean z4) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            this.defaultValue = z4;
            this.value = getDefaultValue();
        }

        public boolean getDefaultValue() {
            return this.defaultValue;
        }

        @Override // com.yandex.div.data.Variable
        @NotNull
        public String getName() {
            return this.name;
        }

        public boolean getValue$div_data_release() {
            return this.value;
        }

        public void set(boolean z4) {
            setValue$div_data_release(z4);
        }

        public void setValue$div_data_release(boolean z4) {
            if (this.value == z4) {
                return;
            }
            this.value = z4;
            notifyVariableChanged(this);
        }
    }

    @Metadata
    public static class ColorVariable extends Variable {
        private final int defaultValue;

        @NotNull
        private final String name;
        private int value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ColorVariable(@NotNull String name, int i4) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            this.defaultValue = i4;
            this.value = Color.m211constructorimpl(getDefaultValue());
        }

        public int getDefaultValue() {
            return this.defaultValue;
        }

        @Override // com.yandex.div.data.Variable
        @NotNull
        public String getName() {
            return this.name;
        }

        /* renamed from: getValue-WpymAT4$div_data_release, reason: not valid java name */
        public int m166getValueWpymAT4$div_data_release() {
            return this.value;
        }

        /* renamed from: set-cIhhviA, reason: not valid java name */
        public void m167setcIhhviA(int i4) {
            Integer num = (Integer) ParsingConvertersKt.STRING_TO_COLOR_INT.invoke(Color.m210boximpl(i4));
            if (num != null) {
                m168setValuecIhhviA$div_data_release(Color.m211constructorimpl(num.intValue()));
                return;
            }
            throw new VariableMutationException("Wrong value format for color variable: '" + ((Object) Color.m217toStringimpl(i4)) + '\'', null, 2, null);
        }

        /* renamed from: setValue-cIhhviA$div_data_release, reason: not valid java name */
        public void m168setValuecIhhviA$div_data_release(int i4) {
            if (Color.m213equalsimpl0(this.value, i4)) {
                return;
            }
            this.value = i4;
            notifyVariableChanged(this);
        }
    }

    @Metadata
    public static class DictVariable extends Variable {

        @NotNull
        private final JSONObject defaultValue;

        @NotNull
        private final String name;

        @NotNull
        private JSONObject value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DictVariable(@NotNull String name, @NotNull JSONObject defaultValue) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
            this.name = name;
            this.defaultValue = defaultValue;
            this.value = getDefaultValue();
        }

        @NotNull
        public JSONObject getDefaultValue() {
            return this.defaultValue;
        }

        @Override // com.yandex.div.data.Variable
        @NotNull
        public String getName() {
            return this.name;
        }

        @NotNull
        public JSONObject getValue$div_data_release() {
            return this.value;
        }

        public void set(@NotNull JSONObject newValue) {
            Intrinsics.checkNotNullParameter(newValue, "newValue");
            setValue$div_data_release(newValue);
        }

        public void setValue$div_data_release(@NotNull JSONObject value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (Intrinsics.areEqual(this.value, value)) {
                return;
            }
            this.value = value;
            notifyVariableChanged(this);
        }
    }

    @Metadata
    public static class DoubleVariable extends Variable {
        private final double defaultValue;

        @NotNull
        private final String name;
        private double value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DoubleVariable(@NotNull String name, double d4) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            this.defaultValue = d4;
            this.value = getDefaultValue();
        }

        public double getDefaultValue() {
            return this.defaultValue;
        }

        @Override // com.yandex.div.data.Variable
        @NotNull
        public String getName() {
            return this.name;
        }

        public double getValue$div_data_release() {
            return this.value;
        }

        public void set(double d4) {
            setValue$div_data_release(d4);
        }

        public void setValue$div_data_release(double d4) {
            if (this.value == d4) {
                return;
            }
            this.value = d4;
            notifyVariableChanged(this);
        }
    }

    @Metadata
    public static class IntegerVariable extends Variable {
        private final long defaultValue;

        @NotNull
        private final String name;
        private long value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IntegerVariable(@NotNull String name, long j4) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            this.defaultValue = j4;
            this.value = getDefaultValue();
        }

        public long getDefaultValue() {
            return this.defaultValue;
        }

        @Override // com.yandex.div.data.Variable
        @NotNull
        public String getName() {
            return this.name;
        }

        public long getValue$div_data_release() {
            return this.value;
        }

        public void set(long j4) {
            setValue$div_data_release(j4);
        }

        public void setValue$div_data_release(long j4) {
            if (this.value == j4) {
                return;
            }
            this.value = j4;
            notifyVariableChanged(this);
        }
    }

    @Metadata
    public static class StringVariable extends Variable {

        @NotNull
        private final String defaultValue;

        @NotNull
        private final String name;

        @NotNull
        private String value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StringVariable(@NotNull String name, @NotNull String defaultValue) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
            this.name = name;
            this.defaultValue = defaultValue;
            this.value = getDefaultValue();
        }

        @NotNull
        public String getDefaultValue() {
            return this.defaultValue;
        }

        @Override // com.yandex.div.data.Variable
        @NotNull
        public String getName() {
            return this.name;
        }

        @NotNull
        public String getValue$div_data_release() {
            return this.value;
        }

        public void setValue$div_data_release(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (Intrinsics.areEqual(this.value, value)) {
                return;
            }
            this.value = value;
            notifyVariableChanged(this);
        }
    }

    @Metadata
    public static class UrlVariable extends Variable {

        @NotNull
        private final Uri defaultValue;

        @NotNull
        private final String name;

        @NotNull
        private Uri value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UrlVariable(@NotNull String name, @NotNull Uri defaultValue) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
            this.name = name;
            this.defaultValue = defaultValue;
            this.value = getDefaultValue();
        }

        @NotNull
        public Uri getDefaultValue() {
            return this.defaultValue;
        }

        @Override // com.yandex.div.data.Variable
        @NotNull
        public String getName() {
            return this.name;
        }

        @NotNull
        public Uri getValue$div_data_release() {
            return this.value;
        }

        public void set(@NotNull Uri newValue) {
            Intrinsics.checkNotNullParameter(newValue, "newValue");
            setValue$div_data_release(newValue);
        }

        public void setValue$div_data_release(@NotNull Uri value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (Intrinsics.areEqual(this.value, value)) {
                return;
            }
            this.value = value;
            notifyVariableChanged(this);
        }
    }

    public /* synthetic */ Variable(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private boolean parseAsBoolean(String str) {
        Boolean V02 = StringsKt.V0(str);
        if (V02 != null) {
            return V02.booleanValue();
        }
        Boolean bool = ConvertUtilsKt.toBoolean(parseAsInt(str));
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new VariableMutationException("Unable to convert " + str + " to boolean", null, 2, null);
    }

    /* renamed from: parseAsColor-C4zCDoM, reason: not valid java name */
    private int m165parseAsColorC4zCDoM(String str) {
        Integer num = (Integer) ParsingConvertersKt.STRING_TO_COLOR_INT.invoke(str);
        if (num != null) {
            return Color.m211constructorimpl(num.intValue());
        }
        throw new VariableMutationException("Wrong value format for color variable: '" + str + '\'', null, 2, null);
    }

    private double parseAsDouble(String str) {
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException e4) {
            throw new VariableMutationException(null, e4, 1, null);
        }
    }

    private int parseAsInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e4) {
            throw new VariableMutationException(null, e4, 1, null);
        }
    }

    private JSONArray parseAsJsonArray(String str) {
        try {
            return new JSONArray(str);
        } catch (JSONException e4) {
            throw new VariableMutationException(null, e4, 1, null);
        }
    }

    private JSONObject parseAsJsonObject(String str) {
        try {
            return new JSONObject(str);
        } catch (JSONException e4) {
            throw new VariableMutationException(null, e4, 1, null);
        }
    }

    private long parseAsLong(String str) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e4) {
            throw new VariableMutationException(null, e4, 1, null);
        }
    }

    private Uri parseAsUri(String str) {
        try {
            Uri parse = Uri.parse(str);
            Intrinsics.checkNotNullExpressionValue(parse, "{\n            Uri.parse(this)\n        }");
            return parse;
        } catch (IllegalArgumentException e4) {
            throw new VariableMutationException(null, e4, 1, null);
        }
    }

    public void addObserver(@NotNull Function1<? super Variable, Unit> observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.observers.addObserver(observer);
    }

    @NotNull
    public abstract String getName();

    @NotNull
    public Object getValue() {
        if (this instanceof StringVariable) {
            return ((StringVariable) this).getValue$div_data_release();
        }
        if (this instanceof IntegerVariable) {
            return Long.valueOf(((IntegerVariable) this).getValue$div_data_release());
        }
        if (this instanceof BooleanVariable) {
            return Boolean.valueOf(((BooleanVariable) this).getValue$div_data_release());
        }
        if (this instanceof DoubleVariable) {
            return Double.valueOf(((DoubleVariable) this).getValue$div_data_release());
        }
        if (this instanceof ColorVariable) {
            return Color.m210boximpl(((ColorVariable) this).m166getValueWpymAT4$div_data_release());
        }
        if (this instanceof UrlVariable) {
            return ((UrlVariable) this).getValue$div_data_release();
        }
        if (this instanceof DictVariable) {
            return ((DictVariable) this).getValue$div_data_release();
        }
        if (this instanceof ArrayVariable) {
            return ((ArrayVariable) this).getValue$div_data_release();
        }
        throw new m();
    }

    protected void notifyVariableChanged(@NotNull Variable v4) {
        Intrinsics.checkNotNullParameter(v4, "v");
        Assert.assertMainThread();
        Iterator<Function1<Variable, Unit>> it = this.observers.iterator();
        while (it.hasNext()) {
            it.next().invoke(v4);
        }
    }

    public void removeObserver(@NotNull Function1<? super Variable, Unit> observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.observers.removeObserver(observer);
    }

    public void set(@NotNull String newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        if (this instanceof StringVariable) {
            ((StringVariable) this).setValue$div_data_release(newValue);
            return;
        }
        if (this instanceof IntegerVariable) {
            ((IntegerVariable) this).setValue$div_data_release(parseAsLong(newValue));
            return;
        }
        if (this instanceof BooleanVariable) {
            ((BooleanVariable) this).setValue$div_data_release(parseAsBoolean(newValue));
            return;
        }
        if (this instanceof DoubleVariable) {
            ((DoubleVariable) this).setValue$div_data_release(parseAsDouble(newValue));
            return;
        }
        if (this instanceof ColorVariable) {
            ((ColorVariable) this).m168setValuecIhhviA$div_data_release(m165parseAsColorC4zCDoM(newValue));
            return;
        }
        if (this instanceof UrlVariable) {
            ((UrlVariable) this).setValue$div_data_release(parseAsUri(newValue));
        } else if (this instanceof DictVariable) {
            ((DictVariable) this).setValue$div_data_release(parseAsJsonObject(newValue));
        } else {
            if (!(this instanceof ArrayVariable)) {
                throw new m();
            }
            ((ArrayVariable) this).setValue$div_data_release(parseAsJsonArray(newValue));
        }
    }

    public void setValue(@NotNull Variable from) {
        Intrinsics.checkNotNullParameter(from, "from");
        if ((this instanceof StringVariable) && (from instanceof StringVariable)) {
            ((StringVariable) this).setValue$div_data_release(((StringVariable) from).getValue$div_data_release());
            return;
        }
        if ((this instanceof IntegerVariable) && (from instanceof IntegerVariable)) {
            ((IntegerVariable) this).setValue$div_data_release(((IntegerVariable) from).getValue$div_data_release());
            return;
        }
        if ((this instanceof BooleanVariable) && (from instanceof BooleanVariable)) {
            ((BooleanVariable) this).setValue$div_data_release(((BooleanVariable) from).getValue$div_data_release());
            return;
        }
        if ((this instanceof DoubleVariable) && (from instanceof DoubleVariable)) {
            ((DoubleVariable) this).setValue$div_data_release(((DoubleVariable) from).getValue$div_data_release());
            return;
        }
        if ((this instanceof ColorVariable) && (from instanceof ColorVariable)) {
            ((ColorVariable) this).m168setValuecIhhviA$div_data_release(((ColorVariable) from).m166getValueWpymAT4$div_data_release());
            return;
        }
        if ((this instanceof UrlVariable) && (from instanceof UrlVariable)) {
            ((UrlVariable) this).setValue$div_data_release(((UrlVariable) from).getValue$div_data_release());
            return;
        }
        if ((this instanceof DictVariable) && (from instanceof DictVariable)) {
            ((DictVariable) this).setValue$div_data_release(((DictVariable) from).getValue$div_data_release());
            return;
        }
        if ((this instanceof ArrayVariable) && (from instanceof ArrayVariable)) {
            ((ArrayVariable) this).setValue$div_data_release(((ArrayVariable) from).getValue$div_data_release());
            return;
        }
        throw new VariableMutationException("Setting value to " + this + " from " + from + " not supported!", null, 2, null);
    }

    public void setValueDirectly(@NotNull Object newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        try {
            if (this instanceof StringVariable) {
                ((StringVariable) this).setValue$div_data_release((String) newValue);
                return;
            }
            if (this instanceof IntegerVariable) {
                ((IntegerVariable) this).setValue$div_data_release(((Number) newValue).longValue());
                return;
            }
            if (this instanceof BooleanVariable) {
                ((BooleanVariable) this).setValue$div_data_release(((Boolean) newValue).booleanValue());
                return;
            }
            if (this instanceof DoubleVariable) {
                ((DoubleVariable) this).setValue$div_data_release(((Number) newValue).doubleValue());
                return;
            }
            if (this instanceof ColorVariable) {
                ((ColorVariable) this).m168setValuecIhhviA$div_data_release(((Color) newValue).m218unboximpl());
                return;
            }
            if (this instanceof UrlVariable) {
                ((UrlVariable) this).setValue$div_data_release((Uri) newValue);
            } else if (this instanceof DictVariable) {
                ((DictVariable) this).setValue$div_data_release((JSONObject) newValue);
            } else {
                if (!(this instanceof ArrayVariable)) {
                    throw new m();
                }
                ((ArrayVariable) this).setValue$div_data_release((JSONArray) newValue);
            }
        } catch (ClassCastException unused) {
            throw new VariableMutationException("Unable to set value with type " + newValue.getClass() + " to " + this, null, 2, null);
        }
    }

    @NotNull
    public JSONObject writeToJSON() {
        JSONSerializable mhVar;
        if (this instanceof ArrayVariable) {
            mhVar = new C0802f(getName(), Expression.Companion.constant(((ArrayVariable) this).getValue$div_data_release()));
        } else if (this instanceof BooleanVariable) {
            mhVar = new C0981p(getName(), Expression.Companion.constant(Boolean.valueOf(((BooleanVariable) this).getValue$div_data_release())));
        } else if (this instanceof ColorVariable) {
            mhVar = new C1160z(getName(), Expression.Companion.constant(Integer.valueOf(((ColorVariable) this).m166getValueWpymAT4$div_data_release())));
        } else if (this instanceof DictVariable) {
            mhVar = new U(getName(), Expression.Companion.constant(((DictVariable) this).getValue$div_data_release()));
        } else if (this instanceof DoubleVariable) {
            mhVar = new Ig(getName(), Expression.Companion.constant(Double.valueOf(((DoubleVariable) this).getValue$div_data_release())));
        } else if (this instanceof IntegerVariable) {
            mhVar = new C1141xg(getName(), Expression.Companion.constant(Long.valueOf(((IntegerVariable) this).getValue$div_data_release())));
        } else if (this instanceof StringVariable) {
            mhVar = new ch(getName(), Expression.Companion.constant(((StringVariable) this).getValue$div_data_release()));
        } else {
            if (!(this instanceof UrlVariable)) {
                throw new m();
            }
            mhVar = new mh(getName(), Expression.Companion.constant(((UrlVariable) this).getValue$div_data_release()));
        }
        JSONObject writeToJSON = mhVar.writeToJSON();
        Intrinsics.checkNotNullExpressionValue(writeToJSON, "serializable.writeToJSON()");
        return writeToJSON;
    }

    private Variable() {
        this.observers = new ObserverList<>();
    }
}
