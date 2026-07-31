package com.yandex.div.core.actions;

import android.net.Uri;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.data.Variable;
import com.yandex.div.evaluable.types.Color;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
final class DivActionTypedSetVariableHandler$handleSetVariable$1 extends s implements Function1<Variable, Variable> {
    final /* synthetic */ Object $newValue;
    final /* synthetic */ String $variableName;
    final /* synthetic */ Div2View $view;
    final /* synthetic */ DivActionTypedSetVariableHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DivActionTypedSetVariableHandler$handleSetVariable$1(DivActionTypedSetVariableHandler divActionTypedSetVariableHandler, Object obj, Div2View div2View, String str) {
        super(1);
        this.this$0 = divActionTypedSetVariableHandler;
        this.$newValue = obj;
        this.$view = div2View;
        this.$variableName = str;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Variable invoke(@NotNull Variable variable) {
        Intrinsics.checkNotNullParameter(variable, "variable");
        Object obj = this.$newValue;
        Div2View div2View = this.$view;
        String str = this.$variableName;
        String str2 = "array";
        if (variable instanceof Variable.ArrayVariable) {
            boolean z4 = obj instanceof JSONArray;
            JSONArray jSONArray = (JSONArray) (z4 ? obj : null);
            if (jSONArray == null) {
                if (obj instanceof Integer ? true : obj instanceof Double) {
                    str2 = "number";
                } else if (obj instanceof JSONObject) {
                    str2 = "dict";
                } else if (!z4) {
                    String simpleName = obj.getClass().getSimpleName();
                    Intrinsics.checkNotNullExpressionValue(simpleName, "newValue.javaClass.simpleName");
                    str2 = simpleName.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(str2, "toLowerCase(...)");
                }
                DivActionTypedUtilsKt.logError(div2View, new IllegalArgumentException("Trying to set value with invalid type (" + str2 + ") to variable " + str));
            }
            if (jSONArray != null) {
                ((Variable.ArrayVariable) variable).set(jSONArray);
                return variable;
            }
        } else if (variable instanceof Variable.BooleanVariable) {
            Boolean bool = (Boolean) (obj instanceof Boolean ? obj : null);
            if (bool == null) {
                if (obj instanceof Integer ? true : obj instanceof Double) {
                    str2 = "number";
                } else if (obj instanceof JSONObject) {
                    str2 = "dict";
                } else if (!(obj instanceof JSONArray)) {
                    String simpleName2 = obj.getClass().getSimpleName();
                    Intrinsics.checkNotNullExpressionValue(simpleName2, "newValue.javaClass.simpleName");
                    str2 = simpleName2.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(str2, "toLowerCase(...)");
                }
                DivActionTypedUtilsKt.logError(div2View, new IllegalArgumentException("Trying to set value with invalid type (" + str2 + ") to variable " + str));
            }
            if (bool != null) {
                ((Variable.BooleanVariable) variable).set(bool.booleanValue());
                return variable;
            }
        } else if (variable instanceof Variable.ColorVariable) {
            boolean z5 = obj instanceof Integer;
            Integer num = (Integer) (z5 ? obj : null);
            if (num == null) {
                if (z5 ? true : obj instanceof Double) {
                    str2 = "number";
                } else if (obj instanceof JSONObject) {
                    str2 = "dict";
                } else if (!(obj instanceof JSONArray)) {
                    String simpleName3 = obj.getClass().getSimpleName();
                    Intrinsics.checkNotNullExpressionValue(simpleName3, "newValue.javaClass.simpleName");
                    str2 = simpleName3.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(str2, "toLowerCase(...)");
                }
                DivActionTypedUtilsKt.logError(div2View, new IllegalArgumentException("Trying to set value with invalid type (" + str2 + ") to variable " + str));
            }
            if (num != null) {
                ((Variable.ColorVariable) variable).m167setcIhhviA(Color.m211constructorimpl(num.intValue()));
                return variable;
            }
        } else if (variable instanceof Variable.DictVariable) {
            boolean z6 = obj instanceof JSONObject;
            JSONObject jSONObject = (JSONObject) (z6 ? obj : null);
            if (jSONObject == null) {
                if (obj instanceof Integer ? true : obj instanceof Double) {
                    str2 = "number";
                } else if (z6) {
                    str2 = "dict";
                } else if (!(obj instanceof JSONArray)) {
                    String simpleName4 = obj.getClass().getSimpleName();
                    Intrinsics.checkNotNullExpressionValue(simpleName4, "newValue.javaClass.simpleName");
                    str2 = simpleName4.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(str2, "toLowerCase(...)");
                }
                DivActionTypedUtilsKt.logError(div2View, new IllegalArgumentException("Trying to set value with invalid type (" + str2 + ") to variable " + str));
            }
            if (jSONObject != null) {
                ((Variable.DictVariable) variable).set(jSONObject);
                return variable;
            }
        } else if (variable instanceof Variable.DoubleVariable) {
            boolean z7 = obj instanceof Double;
            Double d4 = (Double) (z7 ? obj : null);
            if (d4 == null) {
                if (obj instanceof Integer ? true : z7) {
                    str2 = "number";
                } else if (obj instanceof JSONObject) {
                    str2 = "dict";
                } else if (!(obj instanceof JSONArray)) {
                    String simpleName5 = obj.getClass().getSimpleName();
                    Intrinsics.checkNotNullExpressionValue(simpleName5, "newValue.javaClass.simpleName");
                    str2 = simpleName5.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(str2, "toLowerCase(...)");
                }
                DivActionTypedUtilsKt.logError(div2View, new IllegalArgumentException("Trying to set value with invalid type (" + str2 + ") to variable " + str));
            }
            if (d4 != null) {
                ((Variable.DoubleVariable) variable).set(d4.doubleValue());
                return variable;
            }
        } else if (variable instanceof Variable.IntegerVariable) {
            Long l4 = (Long) (obj instanceof Long ? obj : null);
            if (l4 == null) {
                if (obj instanceof Integer ? true : obj instanceof Double) {
                    str2 = "number";
                } else if (obj instanceof JSONObject) {
                    str2 = "dict";
                } else if (!(obj instanceof JSONArray)) {
                    String simpleName6 = obj.getClass().getSimpleName();
                    Intrinsics.checkNotNullExpressionValue(simpleName6, "newValue.javaClass.simpleName");
                    str2 = simpleName6.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(str2, "toLowerCase(...)");
                }
                DivActionTypedUtilsKt.logError(div2View, new IllegalArgumentException("Trying to set value with invalid type (" + str2 + ") to variable " + str));
            }
            if (l4 != null) {
                ((Variable.IntegerVariable) variable).set(l4.longValue());
                return variable;
            }
        } else if (variable instanceof Variable.StringVariable) {
            String str3 = (String) (obj instanceof String ? obj : null);
            if (str3 == null) {
                if (obj instanceof Integer ? true : obj instanceof Double) {
                    str2 = "number";
                } else if (obj instanceof JSONObject) {
                    str2 = "dict";
                } else if (!(obj instanceof JSONArray)) {
                    String simpleName7 = obj.getClass().getSimpleName();
                    Intrinsics.checkNotNullExpressionValue(simpleName7, "newValue.javaClass.simpleName");
                    str2 = simpleName7.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(str2, "toLowerCase(...)");
                }
                DivActionTypedUtilsKt.logError(div2View, new IllegalArgumentException("Trying to set value with invalid type (" + str2 + ") to variable " + str));
            }
            if (str3 != null) {
                variable.set(str3);
                return variable;
            }
        } else if (variable instanceof Variable.UrlVariable) {
            Uri uri = (Uri) (obj instanceof Uri ? obj : null);
            if (uri == null) {
                if (obj instanceof Integer ? true : obj instanceof Double) {
                    str2 = "number";
                } else if (obj instanceof JSONObject) {
                    str2 = "dict";
                } else if (!(obj instanceof JSONArray)) {
                    String simpleName8 = obj.getClass().getSimpleName();
                    Intrinsics.checkNotNullExpressionValue(simpleName8, "newValue.javaClass.simpleName");
                    str2 = simpleName8.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(str2, "toLowerCase(...)");
                }
                DivActionTypedUtilsKt.logError(div2View, new IllegalArgumentException("Trying to set value with invalid type (" + str2 + ") to variable " + str));
            }
            if (uri != null) {
                ((Variable.UrlVariable) variable).set(uri);
            }
        }
        return variable;
    }
}
