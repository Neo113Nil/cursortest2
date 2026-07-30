package z;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class m {

    @SerializedName("lg")
    private final String language;

    @SerializedName("rl")
    private final Integer role;

    @SerializedName("w")
    private final String word;

    @SerializedName("wp")
    private final String wordType;

    public m(String word, String wordType, Integer num, String language) {
        s.checkNotNullParameter(word, "word");
        s.checkNotNullParameter(wordType, "wordType");
        s.checkNotNullParameter(language, "language");
        this.word = word;
        this.wordType = wordType;
        this.role = num;
        this.language = language;
    }

    public static /* synthetic */ m copy$default(m mVar, String str, String str2, Integer num, String str3, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = mVar.word;
        }
        if ((i8 & 2) != 0) {
            str2 = mVar.wordType;
        }
        if ((i8 & 4) != 0) {
            num = mVar.role;
        }
        if ((i8 & 8) != 0) {
            str3 = mVar.language;
        }
        return mVar.copy(str, str2, num, str3);
    }

    public final String component1() {
        return this.word;
    }

    public final String component2() {
        return this.wordType;
    }

    public final Integer component3() {
        return this.role;
    }

    public final String component4() {
        return this.language;
    }

    public final m copy(String word, String wordType, Integer num, String language) {
        s.checkNotNullParameter(word, "word");
        s.checkNotNullParameter(wordType, "wordType");
        s.checkNotNullParameter(language, "language");
        return new m(word, wordType, num, language);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return s.areEqual(this.word, mVar.word) && s.areEqual(this.wordType, mVar.wordType) && s.areEqual(this.role, mVar.role) && s.areEqual(this.language, mVar.language);
    }

    public final String getLanguage() {
        return this.language;
    }

    public final Integer getRole() {
        return this.role;
    }

    public final String getWord() {
        return this.word;
    }

    public final String getWordType() {
        return this.wordType;
    }

    public int hashCode() {
        int hashCode = ((this.word.hashCode() * 31) + this.wordType.hashCode()) * 31;
        Integer num = this.role;
        return ((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.language.hashCode();
    }

    public String toString() {
        return "SmartCwData(word=" + this.word + ", wordType=" + this.wordType + ", role=" + this.role + ", language=" + this.language + ')';
    }

    public /* synthetic */ m(String str, String str2, Integer num, String str3, int i8, kotlin.jvm.internal.o oVar) {
        this(str, str2, (i8 & 4) != 0 ? null : num, str3);
    }
}
