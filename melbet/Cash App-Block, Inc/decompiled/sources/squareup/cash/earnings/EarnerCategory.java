package squareup.cash.earnings;

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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \u00132\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0013B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0014"}, d2 = {"Lsquareup/cash/earnings/EarnerCategory;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "EARNER_CATEGORY_DO_NOT_USE", "BEAUTY", "ENTERTAINMENT", "FITNESS", "FOOD_AND_DRINK", "HOME_AND_REPAIR", "PET_CARE", "RETAIL", "SERVICES", "TRANSPORTATION", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class EarnerCategory implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EarnerCategory[] $VALUES;
    public static final ProtoAdapter ADAPTER;
    public static final EarnerCategory BEAUTY;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final EarnerCategory EARNER_CATEGORY_DO_NOT_USE;
    public static final EarnerCategory ENTERTAINMENT;
    public static final EarnerCategory FITNESS;
    public static final EarnerCategory FOOD_AND_DRINK;
    public static final EarnerCategory HOME_AND_REPAIR;
    public static final EarnerCategory PET_CARE;
    public static final EarnerCategory RETAIL;
    public static final EarnerCategory SERVICES;
    public static final EarnerCategory TRANSPORTATION;
    private final int value;

    private static final /* synthetic */ EarnerCategory[] $values() {
        return new EarnerCategory[]{EARNER_CATEGORY_DO_NOT_USE, BEAUTY, ENTERTAINMENT, FITNESS, FOOD_AND_DRINK, HOME_AND_REPAIR, PET_CARE, RETAIL, SERVICES, TRANSPORTATION};
    }

    static {
        final EarnerCategory earnerCategory = new EarnerCategory("EARNER_CATEGORY_DO_NOT_USE", 0, 0);
        EARNER_CATEGORY_DO_NOT_USE = earnerCategory;
        BEAUTY = new EarnerCategory("BEAUTY", 1, 1);
        ENTERTAINMENT = new EarnerCategory("ENTERTAINMENT", 2, 2);
        FITNESS = new EarnerCategory("FITNESS", 3, 3);
        FOOD_AND_DRINK = new EarnerCategory("FOOD_AND_DRINK", 4, 4);
        HOME_AND_REPAIR = new EarnerCategory("HOME_AND_REPAIR", 5, 5);
        PET_CARE = new EarnerCategory("PET_CARE", 6, 6);
        RETAIL = new EarnerCategory("RETAIL", 7, 7);
        SERVICES = new EarnerCategory("SERVICES", 8, 8);
        TRANSPORTATION = new EarnerCategory("TRANSPORTATION", 9, 9);
        EarnerCategory[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Tags.enumEntries($values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(EarnerCategory.class);
        final Syntax syntax = Syntax.PROTO_2;
        ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, earnerCategory) { // from class: squareup.cash.earnings.EarnerCategory$Companion$ADAPTER$1
            @Override // com.squareup.wire.EnumAdapter
            public EarnerCategory fromValue(int value) {
                return EarnerCategory.INSTANCE.fromValue(value);
            }
        };
    }

    private EarnerCategory(String str, int i, int i2) {
        this.value = i2;
    }

    public static final EarnerCategory fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static EarnerCategory valueOf(String str) {
        return (EarnerCategory) Enum.valueOf(EarnerCategory.class, str);
    }

    public static EarnerCategory[] values() {
        return (EarnerCategory[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lsquareup/cash/earnings/EarnerCategory$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lsquareup/cash/earnings/EarnerCategory;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EarnerCategory fromValue(int value) {
            switch (value) {
                case 0:
                    return EarnerCategory.EARNER_CATEGORY_DO_NOT_USE;
                case 1:
                    return EarnerCategory.BEAUTY;
                case 2:
                    return EarnerCategory.ENTERTAINMENT;
                case 3:
                    return EarnerCategory.FITNESS;
                case 4:
                    return EarnerCategory.FOOD_AND_DRINK;
                case 5:
                    return EarnerCategory.HOME_AND_REPAIR;
                case 6:
                    return EarnerCategory.PET_CARE;
                case 7:
                    return EarnerCategory.RETAIL;
                case 8:
                    return EarnerCategory.SERVICES;
                case 9:
                    return EarnerCategory.TRANSPORTATION;
                default:
                    return null;
            }
        }

        private Companion() {
        }
    }
}
