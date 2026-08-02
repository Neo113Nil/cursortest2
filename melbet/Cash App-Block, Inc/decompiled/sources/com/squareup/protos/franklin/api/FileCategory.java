package com.squareup.protos.franklin.api;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okhttp3.internal.Tags;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b3\b\u0086\u0081\u0002\u0018\u0000 62\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u00016B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5¨\u00067"}, d2 = {"Lcom/squareup/protos/franklin/api/FileCategory;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "SELFIE", "PAY_STUB_FRONT", "W2_FORM_FRONT", "SSN_CARD_FRONT", "SSN_CARD_BACK", "TAX_RETURN_FRONT", "PASSPORT_FRONT", "PASSPORT_CARD_FRONT", "PASSPORT_CARD_BACK", "DRIVERS_LICENSE_FRONT", "DRIVERS_LICENSE_BACK", "STATE_ID_FRONT", "STATE_ID_BACK", "LEXIS_FRONT", "TRANSUNION_FRONT", "MILITARY_ID_FRONT", "MILITARY_ID_BACK", "DEBIT_CARD_FRONT", "DEBIT_CARD_BACK", "GOVERNMENT_ISSUED_ID_FRONT", "GOVERNMENT_ISSUED_ID_BACK", "CREDIT_CARD_FRONT", "CREDIT_CARD_BACK", "DIVORCE_DECREE", "MARRIAGE_CERTIFICATE", "NAME_CHANGE_JUDGMENT", "NYC_ID_BACK", "NYC_ID_FRONT", "NYS_LEARNER_PERMIT_BACK", "NYS_LEARNER_PERMIT_FRONT", "NYS_NON_DRIVER_ID_BACK", "NYS_NON_DRIVER_ID_FRONT", "RESIDENCE_PERMIT_BACK", "RESIDENCE_PERMIT_FRONT", "STUDENT_ID_BACK", "STUDENT_ID_FRONT", "CREDIT_CARD_STATEMENT_BACK", "CREDIT_CARD_STATEMENT_FRONT", "GOVERNMENT_BENEFITS_CARD_BACK", "GOVERNMENT_BENEFITS_CARD_FRONT", "UTILITY_BILL_BACK", "UTILITY_BILL_FRONT", "SELFIE_LEFT", "SELFIE_RIGHT", "PROOF_OF_ADDRESS", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class FileCategory implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FileCategory[] $VALUES;
    public static final ProtoAdapter ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;

    @Deprecated
    public static final FileCategory SELFIE = new FileCategory("SELFIE", 0, 1);
    public static final FileCategory PAY_STUB_FRONT = new FileCategory("PAY_STUB_FRONT", 1, 2);
    public static final FileCategory W2_FORM_FRONT = new FileCategory("W2_FORM_FRONT", 2, 3);
    public static final FileCategory SSN_CARD_FRONT = new FileCategory("SSN_CARD_FRONT", 3, 4);
    public static final FileCategory SSN_CARD_BACK = new FileCategory("SSN_CARD_BACK", 4, 5);
    public static final FileCategory TAX_RETURN_FRONT = new FileCategory("TAX_RETURN_FRONT", 5, 6);
    public static final FileCategory PASSPORT_FRONT = new FileCategory("PASSPORT_FRONT", 6, 7);
    public static final FileCategory PASSPORT_CARD_FRONT = new FileCategory("PASSPORT_CARD_FRONT", 7, 8);
    public static final FileCategory PASSPORT_CARD_BACK = new FileCategory("PASSPORT_CARD_BACK", 8, 9);
    public static final FileCategory DRIVERS_LICENSE_FRONT = new FileCategory("DRIVERS_LICENSE_FRONT", 9, 10);
    public static final FileCategory DRIVERS_LICENSE_BACK = new FileCategory("DRIVERS_LICENSE_BACK", 10, 11);
    public static final FileCategory STATE_ID_FRONT = new FileCategory("STATE_ID_FRONT", 11, 12);
    public static final FileCategory STATE_ID_BACK = new FileCategory("STATE_ID_BACK", 12, 13);
    public static final FileCategory LEXIS_FRONT = new FileCategory("LEXIS_FRONT", 13, 14);
    public static final FileCategory TRANSUNION_FRONT = new FileCategory("TRANSUNION_FRONT", 14, 15);
    public static final FileCategory MILITARY_ID_FRONT = new FileCategory("MILITARY_ID_FRONT", 15, 16);
    public static final FileCategory MILITARY_ID_BACK = new FileCategory("MILITARY_ID_BACK", 16, 17);
    public static final FileCategory DEBIT_CARD_FRONT = new FileCategory("DEBIT_CARD_FRONT", 17, 18);
    public static final FileCategory DEBIT_CARD_BACK = new FileCategory("DEBIT_CARD_BACK", 18, 19);
    public static final FileCategory GOVERNMENT_ISSUED_ID_FRONT = new FileCategory("GOVERNMENT_ISSUED_ID_FRONT", 19, 20);
    public static final FileCategory GOVERNMENT_ISSUED_ID_BACK = new FileCategory("GOVERNMENT_ISSUED_ID_BACK", 20, 21);
    public static final FileCategory CREDIT_CARD_FRONT = new FileCategory("CREDIT_CARD_FRONT", 21, 22);
    public static final FileCategory CREDIT_CARD_BACK = new FileCategory("CREDIT_CARD_BACK", 22, 23);
    public static final FileCategory DIVORCE_DECREE = new FileCategory("DIVORCE_DECREE", 23, 24);
    public static final FileCategory MARRIAGE_CERTIFICATE = new FileCategory("MARRIAGE_CERTIFICATE", 24, 25);
    public static final FileCategory NAME_CHANGE_JUDGMENT = new FileCategory("NAME_CHANGE_JUDGMENT", 25, 26);
    public static final FileCategory NYC_ID_BACK = new FileCategory("NYC_ID_BACK", 26, 27);
    public static final FileCategory NYC_ID_FRONT = new FileCategory("NYC_ID_FRONT", 27, 28);
    public static final FileCategory NYS_LEARNER_PERMIT_BACK = new FileCategory("NYS_LEARNER_PERMIT_BACK", 28, 29);
    public static final FileCategory NYS_LEARNER_PERMIT_FRONT = new FileCategory("NYS_LEARNER_PERMIT_FRONT", 29, 30);
    public static final FileCategory NYS_NON_DRIVER_ID_BACK = new FileCategory("NYS_NON_DRIVER_ID_BACK", 30, 31);
    public static final FileCategory NYS_NON_DRIVER_ID_FRONT = new FileCategory("NYS_NON_DRIVER_ID_FRONT", 31, 32);
    public static final FileCategory RESIDENCE_PERMIT_BACK = new FileCategory("RESIDENCE_PERMIT_BACK", 32, 33);
    public static final FileCategory RESIDENCE_PERMIT_FRONT = new FileCategory("RESIDENCE_PERMIT_FRONT", 33, 34);
    public static final FileCategory STUDENT_ID_BACK = new FileCategory("STUDENT_ID_BACK", 34, 35);
    public static final FileCategory STUDENT_ID_FRONT = new FileCategory("STUDENT_ID_FRONT", 35, 36);
    public static final FileCategory CREDIT_CARD_STATEMENT_BACK = new FileCategory("CREDIT_CARD_STATEMENT_BACK", 36, 37);
    public static final FileCategory CREDIT_CARD_STATEMENT_FRONT = new FileCategory("CREDIT_CARD_STATEMENT_FRONT", 37, 38);
    public static final FileCategory GOVERNMENT_BENEFITS_CARD_BACK = new FileCategory("GOVERNMENT_BENEFITS_CARD_BACK", 38, 39);
    public static final FileCategory GOVERNMENT_BENEFITS_CARD_FRONT = new FileCategory("GOVERNMENT_BENEFITS_CARD_FRONT", 39, 40);
    public static final FileCategory UTILITY_BILL_BACK = new FileCategory("UTILITY_BILL_BACK", 40, 41);
    public static final FileCategory UTILITY_BILL_FRONT = new FileCategory("UTILITY_BILL_FRONT", 41, 42);
    public static final FileCategory SELFIE_LEFT = new FileCategory("SELFIE_LEFT", 42, 43);
    public static final FileCategory SELFIE_RIGHT = new FileCategory("SELFIE_RIGHT", 43, 44);
    public static final FileCategory PROOF_OF_ADDRESS = new FileCategory("PROOF_OF_ADDRESS", 44, 45);

    private static final /* synthetic */ FileCategory[] $values() {
        return new FileCategory[]{SELFIE, PAY_STUB_FRONT, W2_FORM_FRONT, SSN_CARD_FRONT, SSN_CARD_BACK, TAX_RETURN_FRONT, PASSPORT_FRONT, PASSPORT_CARD_FRONT, PASSPORT_CARD_BACK, DRIVERS_LICENSE_FRONT, DRIVERS_LICENSE_BACK, STATE_ID_FRONT, STATE_ID_BACK, LEXIS_FRONT, TRANSUNION_FRONT, MILITARY_ID_FRONT, MILITARY_ID_BACK, DEBIT_CARD_FRONT, DEBIT_CARD_BACK, GOVERNMENT_ISSUED_ID_FRONT, GOVERNMENT_ISSUED_ID_BACK, CREDIT_CARD_FRONT, CREDIT_CARD_BACK, DIVORCE_DECREE, MARRIAGE_CERTIFICATE, NAME_CHANGE_JUDGMENT, NYC_ID_BACK, NYC_ID_FRONT, NYS_LEARNER_PERMIT_BACK, NYS_LEARNER_PERMIT_FRONT, NYS_NON_DRIVER_ID_BACK, NYS_NON_DRIVER_ID_FRONT, RESIDENCE_PERMIT_BACK, RESIDENCE_PERMIT_FRONT, STUDENT_ID_BACK, STUDENT_ID_FRONT, CREDIT_CARD_STATEMENT_BACK, CREDIT_CARD_STATEMENT_FRONT, GOVERNMENT_BENEFITS_CARD_BACK, GOVERNMENT_BENEFITS_CARD_FRONT, UTILITY_BILL_BACK, UTILITY_BILL_FRONT, SELFIE_LEFT, SELFIE_RIGHT, PROOF_OF_ADDRESS};
    }

    static {
        FileCategory[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Tags.enumEntries($values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(FileCategory.class);
        final Syntax syntax = Syntax.PROTO_2;
        ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.FileCategory$Companion$ADAPTER$1
            @Override // com.squareup.wire.EnumAdapter
            public FileCategory fromValue(int value) {
                return FileCategory.INSTANCE.fromValue(value);
            }
        };
    }

    private FileCategory(String str, int i, int i2) {
        this.value = i2;
    }

    public static final FileCategory fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static FileCategory valueOf(String str) {
        return (FileCategory) Enum.valueOf(FileCategory.class, str);
    }

    public static FileCategory[] values() {
        return (FileCategory[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/FileCategory$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/FileCategory;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FileCategory fromValue(int value) {
            switch (value) {
                case 1:
                    return FileCategory.SELFIE;
                case 2:
                    return FileCategory.PAY_STUB_FRONT;
                case 3:
                    return FileCategory.W2_FORM_FRONT;
                case 4:
                    return FileCategory.SSN_CARD_FRONT;
                case 5:
                    return FileCategory.SSN_CARD_BACK;
                case 6:
                    return FileCategory.TAX_RETURN_FRONT;
                case 7:
                    return FileCategory.PASSPORT_FRONT;
                case 8:
                    return FileCategory.PASSPORT_CARD_FRONT;
                case 9:
                    return FileCategory.PASSPORT_CARD_BACK;
                case 10:
                    return FileCategory.DRIVERS_LICENSE_FRONT;
                case 11:
                    return FileCategory.DRIVERS_LICENSE_BACK;
                case 12:
                    return FileCategory.STATE_ID_FRONT;
                case 13:
                    return FileCategory.STATE_ID_BACK;
                case 14:
                    return FileCategory.LEXIS_FRONT;
                case 15:
                    return FileCategory.TRANSUNION_FRONT;
                case 16:
                    return FileCategory.MILITARY_ID_FRONT;
                case 17:
                    return FileCategory.MILITARY_ID_BACK;
                case 18:
                    return FileCategory.DEBIT_CARD_FRONT;
                case 19:
                    return FileCategory.DEBIT_CARD_BACK;
                case 20:
                    return FileCategory.GOVERNMENT_ISSUED_ID_FRONT;
                case 21:
                    return FileCategory.GOVERNMENT_ISSUED_ID_BACK;
                case 22:
                    return FileCategory.CREDIT_CARD_FRONT;
                case 23:
                    return FileCategory.CREDIT_CARD_BACK;
                case 24:
                    return FileCategory.DIVORCE_DECREE;
                case 25:
                    return FileCategory.MARRIAGE_CERTIFICATE;
                case 26:
                    return FileCategory.NAME_CHANGE_JUDGMENT;
                case 27:
                    return FileCategory.NYC_ID_BACK;
                case 28:
                    return FileCategory.NYC_ID_FRONT;
                case 29:
                    return FileCategory.NYS_LEARNER_PERMIT_BACK;
                case 30:
                    return FileCategory.NYS_LEARNER_PERMIT_FRONT;
                case 31:
                    return FileCategory.NYS_NON_DRIVER_ID_BACK;
                case 32:
                    return FileCategory.NYS_NON_DRIVER_ID_FRONT;
                case 33:
                    return FileCategory.RESIDENCE_PERMIT_BACK;
                case 34:
                    return FileCategory.RESIDENCE_PERMIT_FRONT;
                case 35:
                    return FileCategory.STUDENT_ID_BACK;
                case 36:
                    return FileCategory.STUDENT_ID_FRONT;
                case 37:
                    return FileCategory.CREDIT_CARD_STATEMENT_BACK;
                case 38:
                    return FileCategory.CREDIT_CARD_STATEMENT_FRONT;
                case 39:
                    return FileCategory.GOVERNMENT_BENEFITS_CARD_BACK;
                case 40:
                    return FileCategory.GOVERNMENT_BENEFITS_CARD_FRONT;
                case 41:
                    return FileCategory.UTILITY_BILL_BACK;
                case 42:
                    return FileCategory.UTILITY_BILL_FRONT;
                case 43:
                    return FileCategory.SELFIE_LEFT;
                case 44:
                    return FileCategory.SELFIE_RIGHT;
                case 45:
                    return FileCategory.PROOF_OF_ADDRESS;
                default:
                    return null;
            }
        }

        private Companion() {
        }
    }
}
