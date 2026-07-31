package com.yandex.div.core.expression.storedvalues;

import android.net.Uri;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.data.StoredValue;
import com.yandex.div.evaluable.types.Color;
import com.yandex.div.evaluable.types.Url;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.parser.ParsingConvertersKt;
import com.yandex.div.internal.util.ConvertUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class StoredValuesActionHandler {

    @NotNull
    public static final StoredValuesActionHandler INSTANCE = new StoredValuesActionHandler();

    @Metadata
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StoredValue.Type.values().length];
            try {
                iArr[StoredValue.Type.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StoredValue.Type.INTEGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StoredValue.Type.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StoredValue.Type.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StoredValue.Type.COLOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[StoredValue.Type.URL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private StoredValuesActionHandler() {
    }

    public static final boolean canHandle(@Nullable String str) {
        return Intrinsics.areEqual(str, "set_stored_value");
    }

    private final StoredValue createStoredValue(StoredValue.Type type, String str, String str2) {
        switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                return new StoredValue.StringStoredValue(str, str2);
            case 2:
                return new StoredValue.IntegerStoredValue(str, parseAsLong(str2));
            case 3:
                return new StoredValue.BooleanStoredValue(str, parseAsBoolean(str2));
            case 4:
                return new StoredValue.DoubleStoredValue(str, parseAsDouble(str2));
            case 5:
                return new StoredValue.ColorStoredValue(str, m35parseAsColorC4zCDoM(str2), null);
            case 6:
                return new StoredValue.UrlStoredValue(str, m36parseAsUrlVcSV9u8(str2), null);
            default:
                throw new StoredValueDeclarationException("Cannot create stored value of type = '" + type + "'.", null, 2, null);
        }
    }

    private final String getParam(Uri uri, String str) {
        String queryParameter = uri.getQueryParameter(str);
        if (queryParameter != null) {
            return queryParameter;
        }
        KAssert kAssert = KAssert.INSTANCE;
        if (Assert.isEnabled()) {
            Assert.fail("The required parameter " + str + " is missing");
        }
        return null;
    }

    public static final boolean handleAction(@NotNull Uri uri, @NotNull DivViewFacade view) {
        String param;
        String param2;
        Long n4;
        StoredValue.Type fromString;
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(view, "view");
        Div2View div2View = view instanceof Div2View ? (Div2View) view : null;
        if (div2View == null) {
            KAssert kAssert = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Handler view is not instance of Div2View");
            }
            return false;
        }
        StoredValuesActionHandler storedValuesActionHandler = INSTANCE;
        String param3 = storedValuesActionHandler.getParam(uri, "name");
        if (param3 != null && (param = storedValuesActionHandler.getParam(uri, "value")) != null && (param2 = storedValuesActionHandler.getParam(uri, "lifetime")) != null && (n4 = StringsKt.n(param2)) != null) {
            long longValue = n4.longValue();
            String param4 = storedValuesActionHandler.getParam(uri, "type");
            if (param4 != null && (fromString = StoredValue.Type.Converter.fromString(param4)) != null) {
                try {
                    return storedValuesActionHandler.executeAction(storedValuesActionHandler.createStoredValue(fromString, param3, param), longValue, div2View);
                } catch (StoredValueDeclarationException e4) {
                    KAssert kAssert2 = KAssert.INSTANCE;
                    if (Assert.isEnabled()) {
                        Assert.fail("Stored value '" + param3 + "' declaration failed: " + e4.getMessage());
                    }
                }
            }
        }
        return false;
    }

    private final boolean parseAsBoolean(String str) {
        Boolean V02 = StringsKt.V0(str);
        if (V02 != null) {
            return V02.booleanValue();
        }
        Boolean bool = ConvertUtilsKt.toBoolean(parseAsInt(str));
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new StoredValueDeclarationException("Unable to convert " + str + " to boolean", null, 2, null);
    }

    /* renamed from: parseAsColor-C4zCDoM, reason: not valid java name */
    private final int m35parseAsColorC4zCDoM(String str) {
        Integer num = (Integer) ParsingConvertersKt.STRING_TO_COLOR_INT.invoke(str);
        if (num != null) {
            return Color.m211constructorimpl(num.intValue());
        }
        throw new StoredValueDeclarationException("Wrong value format for color stored value: '" + str + '\'', null, 2, null);
    }

    private final double parseAsDouble(String str) {
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException e4) {
            throw new StoredValueDeclarationException(null, e4, 1, null);
        }
    }

    private final int parseAsInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e4) {
            throw new StoredValueDeclarationException(null, e4, 1, null);
        }
    }

    private final long parseAsLong(String str) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e4) {
            throw new StoredValueDeclarationException(null, e4, 1, null);
        }
    }

    /* renamed from: parseAsUrl-VcSV9u8, reason: not valid java name */
    private final String m36parseAsUrlVcSV9u8(String str) {
        try {
            return Url.Companion.m228fromVcSV9u8(str);
        } catch (IllegalArgumentException e4) {
            throw new StoredValueDeclarationException(null, e4, 1, null);
        }
    }

    public final boolean executeAction(@NotNull StoredValue storedValue, long j4, @NotNull Div2View div2View) {
        Intrinsics.checkNotNullParameter(storedValue, "storedValue");
        Intrinsics.checkNotNullParameter(div2View, "div2View");
        StoredValuesController storedValuesController = div2View.getDiv2Component$div_release().getStoredValuesController();
        Intrinsics.checkNotNullExpressionValue(storedValuesController, "div2View.div2Component.storedValuesController");
        return storedValuesController.setStoredValue(storedValue, j4, div2View.getViewComponent$div_release().getErrorCollectors().getOrCreate(div2View.getDivTag(), div2View.getDivData()));
    }
}
