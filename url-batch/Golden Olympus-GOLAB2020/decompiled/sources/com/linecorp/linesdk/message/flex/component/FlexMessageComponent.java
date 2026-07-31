package com.linecorp.linesdk.message.flex.component;

import androidx.annotation.NonNull;
import com.ironsource.ge;
import com.linecorp.linesdk.message.Jsonable;
import com.linecorp.linesdk.message.Stringable;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class FlexMessageComponent implements Jsonable {
    protected static final int FLEX_VALUE_NONE = -1;

    @NonNull
    protected final Type type;

    public enum Alignment implements Stringable {
        START,
        END,
        CENTER
    }

    public enum AspectMode implements Stringable {
        COVER,
        FIT
    }

    public enum AspectRatio {
        RATIO_1x1("1:1"),
        RATIO_1_51x1("1.51:1"),
        RATIO_1_91x1("1.91:1"),
        RATIO_4x3("4:3"),
        RATIO_16x9("16:9"),
        RATIO_20x13("20:13"),
        RATIO_2x1("2:1"),
        RATIO_3x1("3:1"),
        RATIO_3x4("3:4"),
        RATIO_9x16("9:16"),
        RATIO_1x2("1:2"),
        RATIO_1x3("1:3");

        private String value;

        AspectRatio(@NonNull String str) {
            this.value = str;
        }

        public String getValue() {
            return this.value;
        }
    }

    public enum Gravity implements Stringable {
        TOP,
        BOTTOM,
        CENTER
    }

    public enum Height implements Stringable {
        SM,
        MD
    }

    public enum Layout implements Stringable {
        HORIZONTAL,
        VERTICAL,
        BASELINE
    }

    public enum Margin implements Stringable {
        NONE,
        XS,
        SM,
        MD,
        LG,
        XL,
        XXL
    }

    public enum Size implements Stringable {
        XXS("xxs"),
        XS("xs"),
        SM("sm"),
        MD(ge.f16499u),
        LG("lg"),
        XL("xl"),
        XXL("xxl"),
        XL3("3xl"),
        XL4("4xl"),
        XL5("5xl"),
        FULL("full");

        private String value;

        Size(@NonNull String str) {
            this.value = str;
        }

        public String getValue() {
            return this.value;
        }
    }

    public enum Style implements Stringable {
        LINK,
        PRIMARY,
        SECONDARY
    }

    public enum Type implements Stringable {
        BOX,
        BUTTON,
        FILLER,
        ICON,
        IMAGE,
        SEPARATOR,
        SPACER,
        TEXT
    }

    public enum Weight implements Stringable {
        BOLD,
        REGULAR
    }

    public FlexMessageComponent(@NonNull Type type) {
        this.type = type;
    }

    @Override // com.linecorp.linesdk.message.Jsonable
    @NonNull
    public JSONObject toJsonObject() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", this.type.name().toLowerCase());
        return jSONObject;
    }
}
