package squareup.cash.cryptocurrency;

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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lsquareup/cash/cryptocurrency/BitcoinDisplayUnits;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "BITCOIN", "SATOSHIS", "BITCOIN_SYMBOL", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BitcoinDisplayUnits implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BitcoinDisplayUnits[] $VALUES;
    public static final ProtoAdapter ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;
    public static final BitcoinDisplayUnits BITCOIN = new BitcoinDisplayUnits("BITCOIN", 0, 1);
    public static final BitcoinDisplayUnits SATOSHIS = new BitcoinDisplayUnits("SATOSHIS", 1, 2);
    public static final BitcoinDisplayUnits BITCOIN_SYMBOL = new BitcoinDisplayUnits("BITCOIN_SYMBOL", 2, 3);

    private static final /* synthetic */ BitcoinDisplayUnits[] $values() {
        return new BitcoinDisplayUnits[]{BITCOIN, SATOSHIS, BITCOIN_SYMBOL};
    }

    static {
        BitcoinDisplayUnits[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Tags.enumEntries($values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(BitcoinDisplayUnits.class);
        final Syntax syntax = Syntax.PROTO_2;
        ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: squareup.cash.cryptocurrency.BitcoinDisplayUnits$Companion$ADAPTER$1
            @Override // com.squareup.wire.EnumAdapter
            public BitcoinDisplayUnits fromValue(int value) {
                return BitcoinDisplayUnits.INSTANCE.fromValue(value);
            }
        };
    }

    private BitcoinDisplayUnits(String str, int i, int i2) {
        this.value = i2;
    }

    public static final BitcoinDisplayUnits fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static BitcoinDisplayUnits valueOf(String str) {
        return (BitcoinDisplayUnits) Enum.valueOf(BitcoinDisplayUnits.class, str);
    }

    public static BitcoinDisplayUnits[] values() {
        return (BitcoinDisplayUnits[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lsquareup/cash/cryptocurrency/BitcoinDisplayUnits$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lsquareup/cash/cryptocurrency/BitcoinDisplayUnits;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final BitcoinDisplayUnits fromValue(int value) {
            if (value == 1) {
                return BitcoinDisplayUnits.BITCOIN;
            }
            if (value == 2) {
                return BitcoinDisplayUnits.SATOSHIS;
            }
            if (value != 3) {
                return null;
            }
            return BitcoinDisplayUnits.BITCOIN_SYMBOL;
        }

        private Companion() {
        }
    }
}
