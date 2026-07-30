package com.artillery.ctc.base;

import androidx.annotation.Keep;
import com.moyoung.dafit.module.common.utils.u;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public abstract class Language {
    public static final Companion Companion = new Companion(null);
    private final String code;
    private final String fullCode;
    private final String voiceName;

    @Keep
    public static final class Ar extends Language {
        public static final Ar INSTANCE = new Ar();

        private Ar() {
            super(u.LANGUAGE_AR, "ar-SA", "ar-SA-ZariyahNeural", null);
        }
    }

    @Keep
    public static final class Bg extends Language {
        public static final Bg INSTANCE = new Bg();

        private Bg() {
            super("bg", "bg-BG", "bg-BG-KalinaNeural", null);
        }
    }

    @Keep
    public static final class Bn extends Language {
        public static final Bn INSTANCE = new Bn();

        private Bn() {
            super("bn", "bn-IN", "bn-IN-TanishaaNeural", null);
        }
    }

    @Keep
    public static final class Bs extends Language {
        public static final Bs INSTANCE = new Bs();

        private Bs() {
            super("bs", "bs-BA", "bs-BA-VesnaNeural", null);
        }
    }

    @Keep
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        @Keep
        public final Language of(String str) {
            s.checkNotNullParameter(str, "str");
            Ar ar = Ar.INSTANCE;
            if (s.areEqual(str, ar.getCode()) || s.areEqual(str, ar.getFullCode())) {
                return ar;
            }
            Bg bg = Bg.INSTANCE;
            if (s.areEqual(str, bg.getCode()) || s.areEqual(str, bg.getFullCode())) {
                return bg;
            }
            Bn bn = Bn.INSTANCE;
            if (s.areEqual(str, bn.getCode()) || s.areEqual(str, bn.getFullCode())) {
                return bn;
            }
            Bs bs = Bs.INSTANCE;
            if (s.areEqual(str, bs.getCode()) || s.areEqual(str, bs.getFullCode())) {
                return bs;
            }
            Da da = Da.INSTANCE;
            if (s.areEqual(str, da.getCode()) || s.areEqual(str, da.getFullCode())) {
                return da;
            }
            De de = De.INSTANCE;
            if (s.areEqual(str, de.getCode()) || s.areEqual(str, de.getFullCode())) {
                return de;
            }
            El el = El.INSTANCE;
            if (s.areEqual(str, el.getCode()) || s.areEqual(str, el.getFullCode())) {
                return el;
            }
            En en = En.INSTANCE;
            if (s.areEqual(str, en.getCode()) || s.areEqual(str, en.getFullCode())) {
                return en;
            }
            Es es = Es.INSTANCE;
            if (s.areEqual(str, es.getCode()) || s.areEqual(str, es.getFullCode())) {
                return es;
            }
            Et et = Et.INSTANCE;
            if (s.areEqual(str, et.getCode()) || s.areEqual(str, et.getFullCode())) {
                return et;
            }
            Fa fa = Fa.INSTANCE;
            if (s.areEqual(str, fa.getCode()) || s.areEqual(str, fa.getFullCode())) {
                return fa;
            }
            Fi fi = Fi.INSTANCE;
            if (s.areEqual(str, fi.getCode()) || s.areEqual(str, fi.getFullCode())) {
                return fi;
            }
            Fil fil = Fil.INSTANCE;
            if (s.areEqual(str, fil.getCode()) || s.areEqual(str, fil.getFullCode())) {
                return fil;
            }
            Fr fr = Fr.INSTANCE;
            if (s.areEqual(str, fr.getCode()) || s.areEqual(str, fr.getFullCode())) {
                return fr;
            }
            Ko ko = Ko.INSTANCE;
            if (s.areEqual(str, ko.getCode()) || s.areEqual(str, ko.getFullCode())) {
                return ko;
            }
            Ga ga = Ga.INSTANCE;
            if (s.areEqual(str, ga.getCode()) || s.areEqual(str, ga.getFullCode())) {
                return ga;
            }
            Gl gl = Gl.INSTANCE;
            if (s.areEqual(str, gl.getCode()) || s.areEqual(str, gl.getFullCode())) {
                return gl;
            }
            Hi hi = Hi.INSTANCE;
            if (s.areEqual(str, hi.getCode()) || s.areEqual(str, hi.getFullCode())) {
                return hi;
            }
            Hr hr = Hr.INSTANCE;
            if (s.areEqual(str, hr.getCode()) || s.areEqual(str, hr.getFullCode())) {
                return hr;
            }
            Hu hu = Hu.INSTANCE;
            if (s.areEqual(str, hu.getCode()) || s.areEqual(str, hu.getFullCode())) {
                return hu;
            }
            Id id = Id.INSTANCE;
            if (s.areEqual(str, id.getCode()) || s.areEqual(str, id.getFullCode())) {
                return id;
            }
            It it = It.INSTANCE;
            if (s.areEqual(str, it.getCode()) || s.areEqual(str, it.getFullCode())) {
                return it;
            }
            Ja ja = Ja.INSTANCE;
            if (s.areEqual(str, ja.getCode()) || s.areEqual(str, ja.getFullCode())) {
                return ja;
            }
            Jv jv = Jv.INSTANCE;
            if (s.areEqual(str, jv.getCode()) || s.areEqual(str, jv.getFullCode())) {
                return jv;
            }
            Ka ka = Ka.INSTANCE;
            if (s.areEqual(str, ka.getCode()) || s.areEqual(str, ka.getFullCode())) {
                return ka;
            }
            Lo lo = Lo.INSTANCE;
            if (s.areEqual(str, lo.getCode()) || s.areEqual(str, lo.getFullCode())) {
                return lo;
            }
            Lt lt = Lt.INSTANCE;
            if (s.areEqual(str, lt.getCode()) || s.areEqual(str, lt.getFullCode())) {
                return lt;
            }
            Lv lv = Lv.INSTANCE;
            if (s.areEqual(str, lv.getCode()) || s.areEqual(str, lv.getFullCode())) {
                return lv;
            }
            Ms ms = Ms.INSTANCE;
            if (s.areEqual(str, ms.getCode()) || s.areEqual(str, ms.getFullCode())) {
                return ms;
            }
            My my = My.INSTANCE;
            if (s.areEqual(str, my.getCode()) || s.areEqual(str, my.getFullCode())) {
                return my;
            }
            Nl nl = Nl.INSTANCE;
            if (s.areEqual(str, nl.getCode()) || s.areEqual(str, nl.getFullCode())) {
                return nl;
            }
            Pl pl = Pl.INSTANCE;
            if (s.areEqual(str, pl.getCode()) || s.areEqual(str, pl.getFullCode())) {
                return pl;
            }
            Pt pt = Pt.INSTANCE;
            if (s.areEqual(str, pt.getCode()) || s.areEqual(str, pt.getFullCode())) {
                return pt;
            }
            Ro ro = Ro.INSTANCE;
            if (s.areEqual(str, ro.getCode()) || s.areEqual(str, ro.getFullCode())) {
                return ro;
            }
            Ru ru = Ru.INSTANCE;
            if (s.areEqual(str, ru.getCode()) || s.areEqual(str, ru.getFullCode())) {
                return ru;
            }
            Sk sk = Sk.INSTANCE;
            if (s.areEqual(str, sk.getCode()) || s.areEqual(str, sk.getFullCode())) {
                return sk;
            }
            Sl sl = Sl.INSTANCE;
            if (s.areEqual(str, sl.getCode()) || s.areEqual(str, sl.getFullCode())) {
                return sl;
            }
            Sv sv = Sv.INSTANCE;
            if (s.areEqual(str, sv.getCode()) || s.areEqual(str, sv.getFullCode())) {
                return sv;
            }
            Th th = Th.INSTANCE;
            if (s.areEqual(str, th.getCode()) || s.areEqual(str, th.getFullCode())) {
                return th;
            }
            Tr tr = Tr.INSTANCE;
            if (s.areEqual(str, tr.getCode()) || s.areEqual(str, tr.getFullCode())) {
                return tr;
            }
            Uk uk = Uk.INSTANCE;
            if (s.areEqual(str, uk.getCode()) || s.areEqual(str, uk.getFullCode())) {
                return uk;
            }
            Uz uz = Uz.INSTANCE;
            if (s.areEqual(str, uz.getCode()) || s.areEqual(str, uz.getFullCode())) {
                return uz;
            }
            Vi vi = Vi.INSTANCE;
            if (s.areEqual(str, vi.getCode()) || s.areEqual(str, vi.getFullCode())) {
                return vi;
            }
            Zh zh = Zh.INSTANCE;
            if (s.areEqual(str, zh.getCode()) || s.areEqual(str, zh.getFullCode())) {
                return zh;
            }
            return null;
        }
    }

    @Keep
    public static final class Da extends Language {
        public static final Da INSTANCE = new Da();

        private Da() {
            super("da", "da-DK", "da-DK-ChristelNeural", null);
        }
    }

    @Keep
    public static final class De extends Language {
        public static final De INSTANCE = new De();

        private De() {
            super(u.LANGUAGE_DE, "de-DE", "de-DE-KatjaNeural", null);
        }
    }

    @Keep
    public static final class El extends Language {
        public static final El INSTANCE = new El();

        private El() {
            super("el", "el-GR", "el-GR-AthinaNeural", null);
        }
    }

    @Keep
    public static final class En extends Language {
        public static final En INSTANCE = new En();

        private En() {
            super("en", "en-US", "en-US-AvaMultilingualNeural", null);
        }
    }

    @Keep
    public static final class Es extends Language {
        public static final Es INSTANCE = new Es();

        private Es() {
            super(u.LANGUAGE_ES, "es-ES", "es-ES-ElviraNeural", null);
        }
    }

    @Keep
    public static final class Et extends Language {
        public static final Et INSTANCE = new Et();

        private Et() {
            super("et", "et-EE", "et-EE-AnuNeural", null);
        }
    }

    @Keep
    public static final class Fa extends Language {
        public static final Fa INSTANCE = new Fa();

        private Fa() {
            super("fa", "fa-IR", "fa-IR-DilaraNeural", null);
        }
    }

    @Keep
    public static final class Fi extends Language {
        public static final Fi INSTANCE = new Fi();

        private Fi() {
            super("fi", "fi-FI", "fi-FI-SelmaNeural", null);
        }
    }

    @Keep
    public static final class Fil extends Language {
        public static final Fil INSTANCE = new Fil();

        private Fil() {
            super("fil", "fil-PH", "fil-PH-BlessicaNeural", null);
        }
    }

    @Keep
    public static final class Fr extends Language {
        public static final Fr INSTANCE = new Fr();

        private Fr() {
            super(u.LANGUAGE_FR, "fr-FR", "fr-FR-DeniseNeural", null);
        }
    }

    @Keep
    public static final class Ga extends Language {
        public static final Ga INSTANCE = new Ga();

        private Ga() {
            super("ga", "ga-IE", "ga-IE-OrlaNeural", null);
        }
    }

    @Keep
    public static final class Gl extends Language {
        public static final Gl INSTANCE = new Gl();

        private Gl() {
            super("gl", "gl-ES", "gl-ES-SabelaNeural", null);
        }
    }

    @Keep
    public static final class Hi extends Language {
        public static final Hi INSTANCE = new Hi();

        private Hi() {
            super("hi", "hi-IN", "hi-IN-AnanyaNeural", null);
        }
    }

    @Keep
    public static final class Hr extends Language {
        public static final Hr INSTANCE = new Hr();

        private Hr() {
            super("hr", "hr-HR", "hr-HR-GabrijelaNeural", null);
        }
    }

    @Keep
    public static final class Hu extends Language {
        public static final Hu INSTANCE = new Hu();

        private Hu() {
            super("hu", "hu-HU", "hu-HU-NoemiNeural", null);
        }
    }

    @Keep
    public static final class Id extends Language {
        public static final Id INSTANCE = new Id();

        private Id() {
            super("id", "id-ID", "id-ID-GadisNeural", null);
        }
    }

    @Keep
    public static final class It extends Language {
        public static final It INSTANCE = new It();

        private It() {
            super(u.LANGUAGE_IT, "it-IT", "it-IT-ElsaNeural", null);
        }
    }

    @Keep
    public static final class Ja extends Language {
        public static final Ja INSTANCE = new Ja();

        private Ja() {
            super(u.LANGUAGE_JA, "ja-JP", "ja-JP-NanamiNeural", null);
        }
    }

    @Keep
    public static final class Jv extends Language {
        public static final Jv INSTANCE = new Jv();

        private Jv() {
            super("jv", "jv-ID", "jv-ID-SitiNeural", null);
        }
    }

    @Keep
    public static final class Ka extends Language {
        public static final Ka INSTANCE = new Ka();

        private Ka() {
            super("ka", "ka-GE", "ka-GE-EkaNeural", null);
        }
    }

    @Keep
    public static final class Ko extends Language {
        public static final Ko INSTANCE = new Ko();

        private Ko() {
            super(u.LANGUAGE_KO, "ko-KR", "ko-KR-SunHiNeural", null);
        }
    }

    @Keep
    public static final class Lo extends Language {
        public static final Lo INSTANCE = new Lo();

        private Lo() {
            super("lo", "lo-LA", "lo-LA-KeomanyNeural", null);
        }
    }

    @Keep
    public static final class Lt extends Language {
        public static final Lt INSTANCE = new Lt();

        private Lt() {
            super("lt", "lt-LT", "lt-LT-OnaNeural", null);
        }
    }

    @Keep
    public static final class Lv extends Language {
        public static final Lv INSTANCE = new Lv();

        private Lv() {
            super("lv", "lv-LV", "lv-LV-EveritaNeural", null);
        }
    }

    @Keep
    public static final class Ms extends Language {
        public static final Ms INSTANCE = new Ms();

        private Ms() {
            super("ms", "ms-MY", "ms-MY-YasminNeural", null);
        }
    }

    @Keep
    public static final class My extends Language {
        public static final My INSTANCE = new My();

        private My() {
            super("my", "my-MM", "my-MM-NilarNeural", null);
        }
    }

    @Keep
    public static final class Nl extends Language {
        public static final Nl INSTANCE = new Nl();

        private Nl() {
            super("nl", "nl-BE", "nl-BE-DenaNeural", null);
        }
    }

    @Keep
    public static final class Pl extends Language {
        public static final Pl INSTANCE = new Pl();

        private Pl() {
            super("pl", "pl-PL", "pl-PL-AgnieszkaNeural", null);
        }
    }

    @Keep
    public static final class Pt extends Language {
        public static final Pt INSTANCE = new Pt();

        private Pt() {
            super(u.LANGUAGE_PT, "pt-BR", "pt-BR-FranciscaNeural", null);
        }
    }

    @Keep
    public static final class Ro extends Language {
        public static final Ro INSTANCE = new Ro();

        private Ro() {
            super("ro", "ro-RO", "ro-RO-AlinaNeural", null);
        }
    }

    @Keep
    public static final class Ru extends Language {
        public static final Ru INSTANCE = new Ru();

        private Ru() {
            super(u.LANGUAGE_RU, "ru-RU", "ru-RU-SvetlanaNeural", null);
        }
    }

    @Keep
    public static final class Sk extends Language {
        public static final Sk INSTANCE = new Sk();

        private Sk() {
            super("sk", "sk-SK", "sk-SK-ViktoriaNeural", null);
        }
    }

    @Keep
    public static final class Sl extends Language {
        public static final Sl INSTANCE = new Sl();

        private Sl() {
            super("sl", "sl-SI", "sl-SI-PetraNeural", null);
        }
    }

    @Keep
    public static final class Sv extends Language {
        public static final Sv INSTANCE = new Sv();

        private Sv() {
            super("sv", "sv-SE", "sv-SE-SofieNeural", null);
        }
    }

    @Keep
    public static final class Th extends Language {
        public static final Th INSTANCE = new Th();

        private Th() {
            super("th", "th-TH", "th-TH-PremwadeeNeural", null);
        }
    }

    @Keep
    public static final class Tr extends Language {
        public static final Tr INSTANCE = new Tr();

        private Tr() {
            super("tr", "tr-TR", "tr-TR-EmelNeural", null);
        }
    }

    @Keep
    public static final class Uk extends Language {
        public static final Uk INSTANCE = new Uk();

        private Uk() {
            super(u.LANGUAGE_TR, "uk-UA", "uk-UA-PolinaNeural", null);
        }
    }

    @Keep
    public static final class Uz extends Language {
        public static final Uz INSTANCE = new Uz();

        private Uz() {
            super("uz", "uz-UZ", "uz-UZ-MadinaNeural", null);
        }
    }

    @Keep
    public static final class Vi extends Language {
        public static final Vi INSTANCE = new Vi();

        private Vi() {
            super("vi", "vi-VN", "vi-VN-HoaiMyNeural", null);
        }
    }

    @Keep
    public static final class Zh extends Language {
        public static final Zh INSTANCE = new Zh();

        private Zh() {
            super("zh", "zh-CN", "zh-CN-XiaoxiaoNeural", null);
        }
    }

    public /* synthetic */ Language(String str, String str2, String str3, o oVar) {
        this(str, str2, str3);
    }

    public final String getCode() {
        return this.code;
    }

    public final String getFullCode() {
        return this.fullCode;
    }

    public final String getVoiceName() {
        return this.voiceName;
    }

    private Language(String str, String str2, String str3) {
        this.code = str;
        this.fullCode = str2;
        this.voiceName = str3;
    }

    public /* synthetic */ Language(String str, String str2, String str3, int i8, o oVar) {
        this(str, str2, (i8 & 4) != 0 ? "" : str3, null);
    }
}
