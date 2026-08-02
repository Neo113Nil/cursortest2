package net.idrnd.face.iad.capture;

import com.squareup.cash.filament.util.IblLoaderKt;
import com.squareup.protos.multipass.service.DeviceDetails;
import com.squareup.protos.timecards.CalculationTotal;
import com.squareup.protos.timecards.OvertimeRule;
import com.squareup.protos.wire.roster.mds.ContactMethod;
import com.stripe.android.cards.CardAccountRangeSource;
import com.stripe.android.cards.DefaultCardAccountRangeRepository$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.internal.InquiryManager;
import dev.chrisbanes.haze.Pool;
import io.noties.markwon.LinkResolverDef;
import io.reactivex.rxjava3.functions.Function;
import kotlin.text.Charsets;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import net.idrnd.face.iad.capture.internal.o0;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import okio.ByteString;
import org.intellij.markdown.MarkdownElementType;
import org.intellij.markdown.MarkdownTokenTypes;
import org.intellij.markdown.flavours.gfm.lexer._GFMLexer;
import squareup.cash.savings.action.Icon;

/* loaded from: classes9.dex */
public final class Plane implements Function {
    public final /* synthetic */ int $r8$classId;

    public Plane(Pool pool, CardAccountRangeSource cardAccountRangeSource, o0 o0Var, LinkResolverDef linkResolverDef) {
        this.$r8$classId = 9;
        IblLoaderKt.combineAsStateFlow((ReadonlyStateFlow) pool.pool, cardAccountRangeSource.getLoading(), (ReadonlyStateFlow) o0Var.a, new DefaultCardAccountRangeRepository$$ExternalSyntheticLambda0(0));
    }

    public static final String access$binarySearch(ByteString byteString, ByteString[] byteStringArr, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        ByteString byteString2 = PublicSuffixDatabase.WILDCARD_LABEL;
        int size$okio = byteString.getSize$okio();
        int i5 = 0;
        while (i5 < size$okio) {
            int i6 = (i5 + size$okio) / 2;
            while (i6 > -1 && byteString.internalGet$okio(i6) != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (byteString.internalGet$okio(i2) == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z2 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z2) {
                    i3 = 46;
                    z = false;
                } else {
                    byte internalGet$okio = byteStringArr[i10].internalGet$okio(i11);
                    byte[] bArr = _UtilCommonKt.EMPTY_BYTE_ARRAY;
                    int i13 = internalGet$okio & 255;
                    z = z2;
                    i3 = i13;
                }
                byte internalGet$okio2 = byteString.internalGet$okio(i7 + i12);
                byte[] bArr2 = _UtilCommonKt.EMPTY_BYTE_ARRAY;
                i4 = i3 - (internalGet$okio2 & 255);
                if (i4 != 0) {
                    break;
                }
                i12++;
                i11++;
                if (i12 == i9) {
                    break;
                }
                if (byteStringArr[i10].getSize$okio() != i11) {
                    z2 = z;
                } else {
                    if (i10 == byteStringArr.length - 1) {
                        break;
                    }
                    i10++;
                    i11 = -1;
                    z2 = true;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i14 = i9 - i12;
                    int size$okio2 = byteStringArr[i10].getSize$okio() - i11;
                    int length = byteStringArr.length;
                    for (int i15 = i10 + 1; i15 < length; i15++) {
                        size$okio2 += byteStringArr[i15].getSize$okio();
                    }
                    if (size$okio2 >= i14) {
                        if (size$okio2 <= i14) {
                            return byteString.substring(i7, i9 + i7).string(Charsets.UTF_8);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            size$okio = i6;
        }
        return null;
    }

    public static final MarkdownElementType access$getDelimiterTokenType(char c) {
        Plane plane = _GFMLexer.Companion;
        return c == '\"' ? MarkdownTokenTypes.DOUBLE_QUOTE : c == '\'' ? MarkdownTokenTypes.SINGLE_QUOTE : c == '(' ? MarkdownTokenTypes.LPAREN : c == ')' ? MarkdownTokenTypes.RPAREN : c == '[' ? MarkdownTokenTypes.LBRACKET : c == ']' ? MarkdownTokenTypes.RBRACKET : c == '<' ? MarkdownTokenTypes.LT : c == '>' ? MarkdownTokenTypes.GT : MarkdownTokenTypes.BAD_CHARACTER;
    }

    public static final int access$zzCMap(int i) {
        Plane plane = _GFMLexer.Companion;
        int i2 = i & 255;
        return i2 == i ? _GFMLexer.ZZ_CMAP_BLOCKS[i2] : _GFMLexer.ZZ_CMAP_BLOCKS[_GFMLexer.ZZ_CMAP_TOP[i >> 8] | i2];
    }

    /* renamed from: fromValue, reason: collision with other method in class */
    public static CalculationTotal.PayState m4213fromValue(int i) {
        switch (i) {
            case 1:
                return CalculationTotal.PayState.REGULAR;
            case 2:
                return CalculationTotal.PayState.REGULAR_PAID_BREAK;
            case 3:
                return CalculationTotal.PayState.REGULAR_UNPAID_BREAK;
            case 4:
                return CalculationTotal.PayState.OVERTIME;
            case 5:
                return CalculationTotal.PayState.OVERTIME_PAID_BREAK;
            case 6:
                return CalculationTotal.PayState.OVERTIME_UNPAID_BREAK;
            case 7:
                return CalculationTotal.PayState.DOUBLETIME;
            case 8:
                return CalculationTotal.PayState.DOUBLETIME_PAID_BREAK;
            case 9:
                return CalculationTotal.PayState.DOUBLETIME_UNPAID_BREAK;
            default:
                return null;
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function, com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    /* renamed from: apply */
    public Object mo39apply(Object obj) {
        return obj;
    }

    public InquiryManager getInstance() {
        InquiryManager inquiryManager;
        InquiryManager inquiryManager2 = InquiryManager.INSTANCE;
        if (inquiryManager2 != null) {
            return inquiryManager2;
        }
        synchronized (this) {
            inquiryManager = InquiryManager.INSTANCE;
            if (inquiryManager == null) {
                inquiryManager = new InquiryManager();
                InquiryManager.INSTANCE = inquiryManager;
            }
        }
        return inquiryManager;
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 22:
                return "IdentityFunction";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ Plane(int i) {
        this.$r8$classId = i;
    }

    /* renamed from: fromValue, reason: collision with other method in class */
    public static OvertimeRule.Reason m4214fromValue(int i) {
        if (i == 1) {
            return OvertimeRule.Reason.WEEKLY_OVERTIME;
        }
        if (i == 2) {
            return OvertimeRule.Reason.DAILY_OVERTIME;
        }
        if (i == 3) {
            return OvertimeRule.Reason.DAILY_DOUBLETIME;
        }
        if (i == 4) {
            return OvertimeRule.Reason.SEVENTH_DAY_OVERTIME;
        }
        if (i != 5) {
            return null;
        }
        return OvertimeRule.Reason.SEVENTH_DAY_DOUBLETIME;
    }

    /* renamed from: fromValue, reason: collision with other method in class */
    public static Icon m4216fromValue(int i) {
        if (i == 1) {
            return Icon.CHEVRON;
        }
        if (i == 2) {
            return Icon.INFORMATION;
        }
        if (i == 3) {
            return Icon.FDIC_INSURED;
        }
        if (i == 4) {
            return Icon.ROUND_UP;
        }
        if (i != 5) {
            return null;
        }
        return Icon.SAVINGS_GROWTH;
    }

    /* renamed from: fromValue, reason: collision with other method in class */
    public static ContactMethod.ContactType m4215fromValue(int i) {
        if (i == 0) {
            return ContactMethod.ContactType.DO_NOT_USE;
        }
        if (i == 1) {
            return ContactMethod.ContactType.DEFAULT;
        }
        if (i == 2) {
            return ContactMethod.ContactType.TRANSACTION_NOTIFICATION;
        }
        if (i == 3) {
            return ContactMethod.ContactType.MERCHANT_SUPPLIED;
        }
        if (i == 4) {
            return ContactMethod.ContactType.RECEIPTS;
        }
        if (i != 5) {
            return null;
        }
        return ContactMethod.ContactType.CHECKOUT_NOTIFICATION;
    }

    public static DeviceDetails.Type fromValue(int i) {
        switch (i) {
            case 0:
                return DeviceDetails.Type.WEB;
            case 1:
                return DeviceDetails.Type.API;
            case 2:
                return DeviceDetails.Type.OAUTH;
            case 3:
                return DeviceDetails.Type.OAUTH_PERM;
            case 4:
                return DeviceDetails.Type.RESTRICTED;
            case 5:
                return DeviceDetails.Type.OAUTH_SHORT;
            case 6:
                return DeviceDetails.Type.WEB_BUYER;
            case 7:
                return DeviceDetails.Type.OAUTH_PERSON;
            case 8:
                return DeviceDetails.Type.OAUTH_DELEGATED;
            default:
                return null;
        }
    }
}
