package squareup.cash.ui.arcade.elements;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okhttp3.internal.Tags;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lsquareup/cash/ui/arcade/elements/VerticalAlignment;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CLIENT_COULD_NOT_PARSE_VERTICAL_ALIGNMENT", "VERTICALLY_CENTERED", "TOP", "BOTTOM", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class VerticalAlignment implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ VerticalAlignment[] $VALUES;
    public static final ProtoAdapter ADAPTER;
    public static final VerticalAlignment BOTTOM;
    public static final VerticalAlignment CLIENT_COULD_NOT_PARSE_VERTICAL_ALIGNMENT;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final VerticalAlignment TOP;
    public static final VerticalAlignment VERTICALLY_CENTERED;
    private final int value;

    private static final /* synthetic */ VerticalAlignment[] $values() {
        return new VerticalAlignment[]{CLIENT_COULD_NOT_PARSE_VERTICAL_ALIGNMENT, VERTICALLY_CENTERED, TOP, BOTTOM};
    }

    static {
        final VerticalAlignment verticalAlignment = new VerticalAlignment("CLIENT_COULD_NOT_PARSE_VERTICAL_ALIGNMENT", 0, 0);
        CLIENT_COULD_NOT_PARSE_VERTICAL_ALIGNMENT = verticalAlignment;
        VERTICALLY_CENTERED = new VerticalAlignment("VERTICALLY_CENTERED", 1, 1);
        TOP = new VerticalAlignment("TOP", 2, 2);
        BOTTOM = new VerticalAlignment("BOTTOM", 3, 3);
        VerticalAlignment[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Tags.enumEntries($values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(VerticalAlignment.class);
        final Syntax syntax = Syntax.PROTO_2;
        ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, verticalAlignment) { // from class: squareup.cash.ui.arcade.elements.VerticalAlignment$Companion$ADAPTER$1
            @Override // com.squareup.wire.EnumAdapter
            public VerticalAlignment fromValue(int value) {
                return VerticalAlignment.INSTANCE.fromValue(value);
            }
        };
    }

    private VerticalAlignment(String str, int i, int i2) {
        this.value = i2;
    }

    public static final VerticalAlignment fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static VerticalAlignment valueOf(String str) {
        return (VerticalAlignment) Enum.valueOf(VerticalAlignment.class, str);
    }

    public static VerticalAlignment[] values() {
        return (VerticalAlignment[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lsquareup/cash/ui/arcade/elements/VerticalAlignment$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lsquareup/cash/ui/arcade/elements/VerticalAlignment;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final VerticalAlignment fromValue(int value) {
            if (value == 0) {
                return VerticalAlignment.CLIENT_COULD_NOT_PARSE_VERTICAL_ALIGNMENT;
            }
            if (value == 1) {
                return VerticalAlignment.VERTICALLY_CENTERED;
            }
            if (value == 2) {
                return VerticalAlignment.TOP;
            }
            if (value != 3) {
                return null;
            }
            return VerticalAlignment.BOTTOM;
        }

        private Companion() {
        }
    }
}
