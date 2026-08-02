package sqip.internal.nonce;

import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.moshi.JsonClass;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Tags;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001aB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001b"}, d2 = {"Lsqip/internal/nonce/CreateCardNonceError;", "", "code", "", "detail", "field", "category", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCategory", "()Ljava/lang/String;", "getCode", "getDetail", "getField", "codeAsEnum", "Lsqip/internal/nonce/CreateCardNonceError$Code;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Code", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class CreateCardNonceError {
    private final String category;
    private final String code;
    private final String detail;
    private final String field;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lsqip/internal/nonce/CreateCardNonceError$Code;", "", "(Ljava/lang/String;I)V", "INVALID_CARD", "INVALID_EXPIRATION", "INVALID_VALUE", "MISSING_REQUIRED_PARAMETER", "NOT_AUTHORIZED", "RATE_LIMITED", "UNSUPPORTED_CARD_BRAND", "UNSUPPORTED_CLIENT_VERSION", "sqip_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Code {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Code[] $VALUES;
        public static final Code INVALID_CARD = new Code("INVALID_CARD", 0);
        public static final Code INVALID_EXPIRATION = new Code("INVALID_EXPIRATION", 1);
        public static final Code INVALID_VALUE = new Code("INVALID_VALUE", 2);
        public static final Code MISSING_REQUIRED_PARAMETER = new Code("MISSING_REQUIRED_PARAMETER", 3);
        public static final Code NOT_AUTHORIZED = new Code("NOT_AUTHORIZED", 4);
        public static final Code RATE_LIMITED = new Code("RATE_LIMITED", 5);
        public static final Code UNSUPPORTED_CARD_BRAND = new Code("UNSUPPORTED_CARD_BRAND", 6);
        public static final Code UNSUPPORTED_CLIENT_VERSION = new Code("UNSUPPORTED_CLIENT_VERSION", 7);

        private static final /* synthetic */ Code[] $values() {
            return new Code[]{INVALID_CARD, INVALID_EXPIRATION, INVALID_VALUE, MISSING_REQUIRED_PARAMETER, NOT_AUTHORIZED, RATE_LIMITED, UNSUPPORTED_CARD_BRAND, UNSUPPORTED_CLIENT_VERSION};
        }

        static {
            Code[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
        }

        private Code(String str, int i) {
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static Code valueOf(String str) {
            return (Code) Enum.valueOf(Code.class, str);
        }

        public static Code[] values() {
            return (Code[]) $VALUES.clone();
        }
    }

    public CreateCardNonceError(String str, String str2, String str3, String str4) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str4);
        this.code = str;
        this.detail = str2;
        this.field = str3;
        this.category = str4;
    }

    public static /* synthetic */ CreateCardNonceError copy$default(CreateCardNonceError createCardNonceError, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createCardNonceError.code;
        }
        if ((i & 2) != 0) {
            str2 = createCardNonceError.detail;
        }
        if ((i & 4) != 0) {
            str3 = createCardNonceError.field;
        }
        if ((i & 8) != 0) {
            str4 = createCardNonceError.category;
        }
        return createCardNonceError.copy(str, str2, str3, str4);
    }

    public final Code codeAsEnum() {
        String str = this.code;
        EnumEntries entries = Code.getEntries();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(entries, 10));
        Iterator<E> it = entries.iterator();
        while (it.hasNext()) {
            arrayList.add(((Code) it.next()).name());
        }
        if (arrayList.contains(str)) {
            return Code.valueOf(this.code);
        }
        return null;
    }

    /* renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDetail() {
        return this.detail;
    }

    /* renamed from: component3, reason: from getter */
    public final String getField() {
        return this.field;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    public final CreateCardNonceError copy(String code, String detail, String field, String category) {
        code.getClass();
        detail.getClass();
        category.getClass();
        return new CreateCardNonceError(code, detail, field, category);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateCardNonceError)) {
            return false;
        }
        CreateCardNonceError createCardNonceError = (CreateCardNonceError) other;
        return Intrinsics.areEqual(this.code, createCardNonceError.code) && Intrinsics.areEqual(this.detail, createCardNonceError.detail) && Intrinsics.areEqual(this.field, createCardNonceError.field) && Intrinsics.areEqual(this.category, createCardNonceError.category);
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getDetail() {
        return this.detail;
    }

    public final String getField() {
        return this.field;
    }

    public int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.code.hashCode() * 31, 31, this.detail);
        String str = this.field;
        return this.category.hashCode() + ((m + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        String str = this.code;
        String str2 = this.detail;
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CreateCardNonceError(code=", str, ", detail=", str2, ", field="), this.field, ", category=", this.category, ")");
    }
}
