package kotlin.text;

import androidx.exifinterface.media.ExifInterface;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;

/* loaded from: classes3.dex */
public abstract class RegexKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final j findNext(Matcher matcher, int i8, CharSequence charSequence) {
        if (matcher.find(i8)) {
            return new MatcherMatchResult(matcher, charSequence);
        }
        return null;
    }

    private static final /* synthetic */ <T extends Enum<T> & f> Set<T> fromInt(final int i8) {
        kotlin.jvm.internal.s.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        EnumSet fromInt$lambda$1 = EnumSet.allOf(Enum.class);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(fromInt$lambda$1, "fromInt$lambda$1");
        kotlin.jvm.internal.s.needClassReification();
        kotlin.collections.v.retainAll(fromInt$lambda$1, new f6.l() { // from class: kotlin.text.RegexKt$fromInt$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Incorrect types in method signature: (TT;)Ljava/lang/Boolean; */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // f6.l
            public final Boolean invoke(Enum r32) {
                f fVar = (f) r32;
                return Boolean.valueOf((i8 & fVar.getMask()) == fVar.getValue());
            }
        });
        Set<T> unmodifiableSet = Collections.unmodifiableSet(fromInt$lambda$1);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(unmodifiableSet, "unmodifiableSet(EnumSet.…mask == it.value }\n    })");
        return unmodifiableSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j matchEntire(Matcher matcher, CharSequence charSequence) {
        if (matcher.matches()) {
            return new MatcherMatchResult(matcher, charSequence);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6.m range(MatchResult matchResult) {
        j6.m until;
        until = j6.v.until(matchResult.start(), matchResult.end());
        return until;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int toInt(Iterable<? extends f> iterable) {
        Iterator<? extends f> it = iterable.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            i8 |= it.next().getValue();
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j6.m range(MatchResult matchResult, int i8) {
        j6.m until;
        until = j6.v.until(matchResult.start(i8), matchResult.end(i8));
        return until;
    }
}
