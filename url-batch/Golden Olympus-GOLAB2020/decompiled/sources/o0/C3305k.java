package o0;

import android.graphics.Matrix;
import android.util.Log;
import android.util.Xml;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.ironsource.InterfaceC1490j3;
import com.ironsource.b9;
import com.ironsource.cc;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.BuildConfig;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import kotlin.KotlinVersion;
import o0.C3271b;
import o0.C3274e;
import o0.C3276g;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DefaultHandler2;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: o0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C3305k {

    /* renamed from: d, reason: collision with root package name */
    private int f41806d;

    /* renamed from: a, reason: collision with root package name */
    private C3276g f41803a = null;

    /* renamed from: b, reason: collision with root package name */
    private C3276g.J f41804b = null;

    /* renamed from: c, reason: collision with root package name */
    private boolean f41805c = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f41807e = false;

    /* renamed from: f, reason: collision with root package name */
    private h f41808f = null;

    /* renamed from: g, reason: collision with root package name */
    private StringBuilder f41809g = null;

    /* renamed from: h, reason: collision with root package name */
    private boolean f41810h = false;

    /* renamed from: i, reason: collision with root package name */
    private StringBuilder f41811i = null;

    /* renamed from: o0.k$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f41812a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f41813b;

        static {
            int[] iArr = new int[g.values().length];
            f41813b = iArr;
            try {
                iArr[g.x.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41813b[g.y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41813b[g.width.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41813b[g.height.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f41813b[g.version.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f41813b[g.href.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f41813b[g.preserveAspectRatio.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f41813b[g.d.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f41813b[g.pathLength.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f41813b[g.rx.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f41813b[g.ry.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f41813b[g.cx.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f41813b[g.cy.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f41813b[g.r.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f41813b[g.x1.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f41813b[g.y1.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f41813b[g.x2.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f41813b[g.y2.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f41813b[g.dx.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f41813b[g.dy.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f41813b[g.requiredFeatures.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f41813b[g.requiredExtensions.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f41813b[g.systemLanguage.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f41813b[g.requiredFormats.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f41813b[g.requiredFonts.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f41813b[g.refX.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f41813b[g.refY.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f41813b[g.markerWidth.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f41813b[g.markerHeight.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f41813b[g.markerUnits.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f41813b[g.orient.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f41813b[g.gradientUnits.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f41813b[g.gradientTransform.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f41813b[g.spreadMethod.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f41813b[g.fx.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f41813b[g.fy.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f41813b[g.offset.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f41813b[g.clipPathUnits.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f41813b[g.startOffset.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f41813b[g.patternUnits.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f41813b[g.patternContentUnits.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f41813b[g.patternTransform.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f41813b[g.maskUnits.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f41813b[g.maskContentUnits.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f41813b[g.style.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f41813b[g.CLASS.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f41813b[g.fill.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f41813b[g.fill_rule.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f41813b[g.fill_opacity.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f41813b[g.stroke.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f41813b[g.stroke_opacity.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                f41813b[g.stroke_width.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                f41813b[g.stroke_linecap.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                f41813b[g.stroke_linejoin.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                f41813b[g.stroke_miterlimit.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                f41813b[g.stroke_dasharray.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                f41813b[g.stroke_dashoffset.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                f41813b[g.opacity.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                f41813b[g.color.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                f41813b[g.font.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                f41813b[g.font_family.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                f41813b[g.font_size.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                f41813b[g.font_weight.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                f41813b[g.font_style.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                f41813b[g.text_decoration.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                f41813b[g.direction.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                f41813b[g.text_anchor.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                f41813b[g.overflow.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                f41813b[g.marker.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                f41813b[g.marker_start.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                f41813b[g.marker_mid.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                f41813b[g.marker_end.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                f41813b[g.display.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                f41813b[g.visibility.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                f41813b[g.stop_color.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                f41813b[g.stop_opacity.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                f41813b[g.clip.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                f41813b[g.clip_path.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                f41813b[g.clip_rule.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                f41813b[g.mask.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                f41813b[g.solid_color.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                f41813b[g.solid_opacity.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                f41813b[g.viewport_fill.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                f41813b[g.viewport_fill_opacity.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                f41813b[g.vector_effect.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                f41813b[g.image_rendering.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                f41813b[g.viewBox.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                f41813b[g.type.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                f41813b[g.media.ordinal()] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            int[] iArr2 = new int[h.values().length];
            f41812a = iArr2;
            try {
                iArr2[h.svg.ordinal()] = 1;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                f41812a[h.g.ordinal()] = 2;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                f41812a[h.a.ordinal()] = 3;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                f41812a[h.defs.ordinal()] = 4;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                f41812a[h.use.ordinal()] = 5;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                f41812a[h.path.ordinal()] = 6;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                f41812a[h.rect.ordinal()] = 7;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                f41812a[h.circle.ordinal()] = 8;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                f41812a[h.ellipse.ordinal()] = 9;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                f41812a[h.line.ordinal()] = 10;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                f41812a[h.polyline.ordinal()] = 11;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                f41812a[h.polygon.ordinal()] = 12;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                f41812a[h.text.ordinal()] = 13;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                f41812a[h.tspan.ordinal()] = 14;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                f41812a[h.tref.ordinal()] = 15;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                f41812a[h.SWITCH.ordinal()] = 16;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                f41812a[h.symbol.ordinal()] = 17;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                f41812a[h.marker.ordinal()] = 18;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                f41812a[h.linearGradient.ordinal()] = 19;
            } catch (NoSuchFieldError unused108) {
            }
            try {
                f41812a[h.radialGradient.ordinal()] = 20;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                f41812a[h.stop.ordinal()] = 21;
            } catch (NoSuchFieldError unused110) {
            }
            try {
                f41812a[h.title.ordinal()] = 22;
            } catch (NoSuchFieldError unused111) {
            }
            try {
                f41812a[h.desc.ordinal()] = 23;
            } catch (NoSuchFieldError unused112) {
            }
            try {
                f41812a[h.clipPath.ordinal()] = 24;
            } catch (NoSuchFieldError unused113) {
            }
            try {
                f41812a[h.textPath.ordinal()] = 25;
            } catch (NoSuchFieldError unused114) {
            }
            try {
                f41812a[h.pattern.ordinal()] = 26;
            } catch (NoSuchFieldError unused115) {
            }
            try {
                f41812a[h.image.ordinal()] = 27;
            } catch (NoSuchFieldError unused116) {
            }
            try {
                f41812a[h.view.ordinal()] = 28;
            } catch (NoSuchFieldError unused117) {
            }
            try {
                f41812a[h.mask.ordinal()] = 29;
            } catch (NoSuchFieldError unused118) {
            }
            try {
                f41812a[h.style.ordinal()] = 30;
            } catch (NoSuchFieldError unused119) {
            }
            try {
                f41812a[h.solidColor.ordinal()] = 31;
            } catch (NoSuchFieldError unused120) {
            }
        }
    }

    /* renamed from: o0.k$b */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final Map f41814a;

        static {
            HashMap hashMap = new HashMap(10);
            f41814a = hashMap;
            hashMap.put("none", C3274e.a.none);
            hashMap.put("xMinYMin", C3274e.a.xMinYMin);
            hashMap.put("xMidYMin", C3274e.a.xMidYMin);
            hashMap.put("xMaxYMin", C3274e.a.xMaxYMin);
            hashMap.put("xMinYMid", C3274e.a.xMinYMid);
            hashMap.put("xMidYMid", C3274e.a.xMidYMid);
            hashMap.put("xMaxYMid", C3274e.a.xMaxYMid);
            hashMap.put("xMinYMax", C3274e.a.xMinYMax);
            hashMap.put("xMidYMax", C3274e.a.xMidYMax);
            hashMap.put("xMaxYMax", C3274e.a.xMaxYMax);
        }

        static C3274e.a a(String str) {
            return (C3274e.a) f41814a.get(str);
        }
    }

    /* renamed from: o0.k$c */
    private static class c {

        /* renamed from: a, reason: collision with root package name */
        private static final Map f41815a;

        static {
            HashMap hashMap = new HashMap(47);
            f41815a = hashMap;
            hashMap.put("aliceblue", -984833);
            hashMap.put("antiquewhite", -332841);
            hashMap.put("aqua", -16711681);
            hashMap.put("aquamarine", -8388652);
            hashMap.put("azure", -983041);
            hashMap.put("beige", -657956);
            hashMap.put("bisque", -6972);
            hashMap.put("black", -16777216);
            hashMap.put("blanchedalmond", -5171);
            hashMap.put("blue", -16776961);
            hashMap.put("blueviolet", -7722014);
            hashMap.put("brown", -5952982);
            hashMap.put("burlywood", -2180985);
            hashMap.put("cadetblue", -10510688);
            hashMap.put("chartreuse", -8388864);
            hashMap.put("chocolate", -2987746);
            hashMap.put("coral", -32944);
            hashMap.put("cornflowerblue", -10185235);
            hashMap.put("cornsilk", -1828);
            hashMap.put("crimson", -2354116);
            hashMap.put("cyan", -16711681);
            hashMap.put("darkblue", -16777077);
            hashMap.put("darkcyan", -16741493);
            hashMap.put("darkgoldenrod", -4684277);
            hashMap.put("darkgray", -5658199);
            hashMap.put("darkgreen", -16751616);
            hashMap.put("darkgrey", -5658199);
            hashMap.put("darkkhaki", -4343957);
            hashMap.put("darkmagenta", -7667573);
            hashMap.put("darkolivegreen", -11179217);
            hashMap.put("darkorange", -29696);
            hashMap.put("darkorchid", -6737204);
            hashMap.put("darkred", -7667712);
            hashMap.put("darksalmon", -1468806);
            hashMap.put("darkseagreen", -7357297);
            hashMap.put("darkslateblue", -12042869);
            hashMap.put("darkslategray", -13676721);
            hashMap.put("darkslategrey", -13676721);
            hashMap.put("darkturquoise", -16724271);
            hashMap.put("darkviolet", -7077677);
            hashMap.put("deeppink", -60269);
            hashMap.put("deepskyblue", -16728065);
            hashMap.put("dimgray", -9868951);
            hashMap.put("dimgrey", -9868951);
            hashMap.put("dodgerblue", -14774017);
            hashMap.put("firebrick", -5103070);
            hashMap.put("floralwhite", -1296);
            hashMap.put("forestgreen", -14513374);
            hashMap.put("fuchsia", -65281);
            hashMap.put("gainsboro", -2302756);
            hashMap.put("ghostwhite", -460545);
            hashMap.put("gold", -10496);
            hashMap.put("goldenrod", -2448096);
            hashMap.put("gray", -8355712);
            hashMap.put("green", -16744448);
            hashMap.put("greenyellow", -5374161);
            hashMap.put("grey", -8355712);
            hashMap.put("honeydew", -983056);
            hashMap.put("hotpink", -38476);
            hashMap.put("indianred", -3318692);
            hashMap.put("indigo", -11861886);
            hashMap.put("ivory", -16);
            hashMap.put("khaki", -989556);
            hashMap.put("lavender", -1644806);
            hashMap.put("lavenderblush", -3851);
            hashMap.put("lawngreen", -8586240);
            hashMap.put("lemonchiffon", -1331);
            hashMap.put("lightblue", -5383962);
            hashMap.put("lightcoral", -1015680);
            hashMap.put("lightcyan", -2031617);
            hashMap.put("lightgoldenrodyellow", -329006);
            hashMap.put("lightgray", -2894893);
            hashMap.put("lightgreen", -7278960);
            hashMap.put("lightgrey", -2894893);
            hashMap.put("lightpink", -18751);
            hashMap.put("lightsalmon", -24454);
            hashMap.put("lightseagreen", -14634326);
            hashMap.put("lightskyblue", -7876870);
            hashMap.put("lightslategray", -8943463);
            hashMap.put("lightslategrey", -8943463);
            hashMap.put("lightsteelblue", -5192482);
            hashMap.put("lightyellow", -32);
            hashMap.put("lime", -16711936);
            hashMap.put("limegreen", -13447886);
            hashMap.put("linen", -331546);
            hashMap.put("magenta", -65281);
            hashMap.put("maroon", -8388608);
            hashMap.put("mediumaquamarine", -10039894);
            hashMap.put("mediumblue", -16777011);
            hashMap.put("mediumorchid", -4565549);
            hashMap.put("mediumpurple", -7114533);
            hashMap.put("mediumseagreen", -12799119);
            hashMap.put("mediumslateblue", -8689426);
            hashMap.put("mediumspringgreen", -16713062);
            hashMap.put("mediumturquoise", -12004916);
            hashMap.put("mediumvioletred", -3730043);
            hashMap.put("midnightblue", -15132304);
            hashMap.put("mintcream", -655366);
            hashMap.put("mistyrose", -6943);
            hashMap.put("moccasin", -6987);
            hashMap.put("navajowhite", -8531);
            hashMap.put("navy", -16777088);
            hashMap.put("oldlace", -133658);
            hashMap.put("olive", -8355840);
            hashMap.put("olivedrab", -9728477);
            hashMap.put("orange", -23296);
            hashMap.put("orangered", -47872);
            hashMap.put("orchid", -2461482);
            hashMap.put("palegoldenrod", -1120086);
            hashMap.put("palegreen", -6751336);
            hashMap.put("paleturquoise", -5247250);
            hashMap.put("palevioletred", -2396013);
            hashMap.put("papayawhip", -4139);
            hashMap.put("peachpuff", -9543);
            hashMap.put("peru", -3308225);
            hashMap.put("pink", -16181);
            hashMap.put("plum", -2252579);
            hashMap.put("powderblue", -5185306);
            hashMap.put("purple", -8388480);
            hashMap.put("rebeccapurple", -10079335);
            hashMap.put("red", -65536);
            hashMap.put("rosybrown", -4419697);
            hashMap.put("royalblue", -12490271);
            hashMap.put("saddlebrown", -7650029);
            hashMap.put("salmon", -360334);
            hashMap.put("sandybrown", -744352);
            hashMap.put("seagreen", -13726889);
            hashMap.put("seashell", -2578);
            hashMap.put("sienna", -6270419);
            hashMap.put("silver", -4144960);
            hashMap.put("skyblue", -7876885);
            hashMap.put("slateblue", -9807155);
            hashMap.put("slategray", -9404272);
            hashMap.put("slategrey", -9404272);
            hashMap.put("snow", -1286);
            hashMap.put("springgreen", -16711809);
            hashMap.put("steelblue", -12156236);
            hashMap.put("tan", -2968436);
            hashMap.put("teal", -16744320);
            hashMap.put("thistle", -2572328);
            hashMap.put("tomato", -40121);
            hashMap.put("turquoise", -12525360);
            hashMap.put("violet", -1146130);
            hashMap.put("wheat", -663885);
            hashMap.put("white", -1);
            hashMap.put("whitesmoke", -657931);
            hashMap.put("yellow", -256);
            hashMap.put("yellowgreen", -6632142);
            hashMap.put(b9.h.f15460T, 0);
        }

        static Integer a(String str) {
            return (Integer) f41815a.get(str);
        }
    }

    /* renamed from: o0.k$d */
    private static class d {

        /* renamed from: a, reason: collision with root package name */
        private static final Map f41816a;

        static {
            HashMap hashMap = new HashMap(9);
            f41816a = hashMap;
            C3276g.d0 d0Var = C3276g.d0.pt;
            hashMap.put("xx-small", new C3276g.C3291p(0.694f, d0Var));
            hashMap.put("x-small", new C3276g.C3291p(0.833f, d0Var));
            hashMap.put("small", new C3276g.C3291p(10.0f, d0Var));
            hashMap.put("medium", new C3276g.C3291p(12.0f, d0Var));
            hashMap.put("large", new C3276g.C3291p(14.4f, d0Var));
            hashMap.put("x-large", new C3276g.C3291p(17.3f, d0Var));
            hashMap.put("xx-large", new C3276g.C3291p(20.7f, d0Var));
            C3276g.d0 d0Var2 = C3276g.d0.percent;
            hashMap.put("smaller", new C3276g.C3291p(83.33f, d0Var2));
            hashMap.put("larger", new C3276g.C3291p(120.0f, d0Var2));
        }

        static C3276g.C3291p a(String str) {
            return (C3276g.C3291p) f41816a.get(str);
        }
    }

    /* renamed from: o0.k$e */
    private static class e {

        /* renamed from: a, reason: collision with root package name */
        private static final Map f41817a;

        static {
            HashMap hashMap = new HashMap(13);
            f41817a = hashMap;
            hashMap.put("normal", 400);
            Integer valueOf = Integer.valueOf(IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED);
            hashMap.put("bold", valueOf);
            hashMap.put("bolder", 1);
            hashMap.put("lighter", -1);
            hashMap.put("100", 100);
            hashMap.put("200", 200);
            hashMap.put("300", 300);
            hashMap.put("400", 400);
            hashMap.put("500", 500);
            hashMap.put("600", 600);
            hashMap.put("700", valueOf);
            hashMap.put("800", 800);
            hashMap.put("900", 900);
        }

        static Integer a(String str) {
            return (Integer) f41817a.get(str);
        }
    }

    /* renamed from: o0.k$f */
    private class f extends DefaultHandler2 {
        private f() {
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i4, int i5) {
            C3305k.this.c1(new String(cArr, i4, i5));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endDocument() {
            C3305k.this.o();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) {
            C3305k.this.p(str, str2, str3);
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void processingInstruction(String str, String str2) {
            C3305k.this.r(str, C3305k.this.x0(new i(str2)));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startDocument() {
            C3305k.this.W0();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) {
            C3305k.this.X0(str, str2, str3, attributes);
        }

        /* synthetic */ f(C3305k c3305k, a aVar) {
            this();
        }
    }

    /* renamed from: o0.k$g */
    private enum g {
        CLASS,
        clip,
        clip_path,
        clipPathUnits,
        clip_rule,
        color,
        cx,
        cy,
        direction,
        dx,
        dy,
        fx,
        fy,
        d,
        display,
        fill,
        fill_rule,
        fill_opacity,
        font,
        font_family,
        font_size,
        font_weight,
        font_style,
        gradientTransform,
        gradientUnits,
        height,
        href,
        image_rendering,
        marker,
        marker_start,
        marker_mid,
        marker_end,
        markerHeight,
        markerUnits,
        markerWidth,
        mask,
        maskContentUnits,
        maskUnits,
        media,
        offset,
        opacity,
        orient,
        overflow,
        pathLength,
        patternContentUnits,
        patternTransform,
        patternUnits,
        points,
        preserveAspectRatio,
        r,
        refX,
        refY,
        requiredFeatures,
        requiredExtensions,
        requiredFormats,
        requiredFonts,
        rx,
        ry,
        solid_color,
        solid_opacity,
        spreadMethod,
        startOffset,
        stop_color,
        stop_opacity,
        stroke,
        stroke_dasharray,
        stroke_dashoffset,
        stroke_linecap,
        stroke_linejoin,
        stroke_miterlimit,
        stroke_opacity,
        stroke_width,
        style,
        systemLanguage,
        text_anchor,
        text_decoration,
        transform,
        type,
        vector_effect,
        version,
        viewBox,
        width,
        x,
        y,
        x1,
        y1,
        x2,
        y2,
        viewport_fill,
        viewport_fill_opacity,
        visibility,
        UNSUPPORTED;


        /* renamed from: P0, reason: collision with root package name */
        private static final Map f41850P0 = new HashMap();

        static {
            for (g gVar : values()) {
                if (gVar == CLASS) {
                    f41850P0.put("class", gVar);
                } else if (gVar != UNSUPPORTED) {
                    f41850P0.put(gVar.name().replace('_', '-'), gVar);
                }
            }
        }

        public static g a(String str) {
            g gVar = (g) f41850P0.get(str);
            return gVar != null ? gVar : UNSUPPORTED;
        }
    }

    /* renamed from: o0.k$h */
    private enum h {
        svg,
        a,
        circle,
        clipPath,
        defs,
        desc,
        ellipse,
        g,
        image,
        line,
        linearGradient,
        marker,
        mask,
        path,
        pattern,
        polygon,
        polyline,
        radialGradient,
        rect,
        solidColor,
        stop,
        style,
        SWITCH,
        symbol,
        text,
        textPath,
        title,
        tref,
        tspan,
        use,
        view,
        UNSUPPORTED;


        /* renamed from: H, reason: collision with root package name */
        private static final Map f41920H = new HashMap();

        static {
            for (h hVar : values()) {
                if (hVar == SWITCH) {
                    f41920H.put("switch", hVar);
                } else if (hVar != UNSUPPORTED) {
                    f41920H.put(hVar.name(), hVar);
                }
            }
        }

        public static h a(String str) {
            h hVar = (h) f41920H.get(str);
            return hVar != null ? hVar : UNSUPPORTED;
        }
    }

    /* renamed from: o0.k$i */
    static class i {

        /* renamed from: a, reason: collision with root package name */
        String f41947a;

        /* renamed from: c, reason: collision with root package name */
        int f41949c;

        /* renamed from: b, reason: collision with root package name */
        int f41948b = 0;

        /* renamed from: d, reason: collision with root package name */
        private C3273d f41950d = new C3273d();

        i(String str) {
            this.f41949c = 0;
            String trim = str.trim();
            this.f41947a = trim;
            this.f41949c = trim.length();
        }

        void A() {
            while (true) {
                int i4 = this.f41948b;
                if (i4 >= this.f41949c || !k(this.f41947a.charAt(i4))) {
                    return;
                } else {
                    this.f41948b++;
                }
            }
        }

        int a() {
            int i4 = this.f41948b;
            int i5 = this.f41949c;
            if (i4 == i5) {
                return -1;
            }
            int i6 = i4 + 1;
            this.f41948b = i6;
            if (i6 < i5) {
                return this.f41947a.charAt(i6);
            }
            return -1;
        }

        String b() {
            int i4 = this.f41948b;
            while (!h() && !k(this.f41947a.charAt(this.f41948b))) {
                this.f41948b++;
            }
            String substring = this.f41947a.substring(i4, this.f41948b);
            this.f41948b = i4;
            return substring;
        }

        Boolean c(Object obj) {
            if (obj == null) {
                return null;
            }
            z();
            return m();
        }

        float d(float f4) {
            if (Float.isNaN(f4)) {
                return Float.NaN;
            }
            z();
            return n();
        }

        float e(Boolean bool) {
            if (bool == null) {
                return Float.NaN;
            }
            z();
            return n();
        }

        boolean f(char c4) {
            int i4 = this.f41948b;
            boolean z4 = i4 < this.f41949c && this.f41947a.charAt(i4) == c4;
            if (z4) {
                this.f41948b++;
            }
            return z4;
        }

        boolean g(String str) {
            int length = str.length();
            int i4 = this.f41948b;
            boolean z4 = i4 <= this.f41949c - length && this.f41947a.substring(i4, i4 + length).equals(str);
            if (z4) {
                this.f41948b += length;
            }
            return z4;
        }

        boolean h() {
            return this.f41948b == this.f41949c;
        }

        boolean i() {
            int i4 = this.f41948b;
            if (i4 == this.f41949c) {
                return false;
            }
            char charAt = this.f41947a.charAt(i4);
            if (charAt < 'a' || charAt > 'z') {
                return charAt >= 'A' && charAt <= 'Z';
            }
            return true;
        }

        boolean j(int i4) {
            return i4 == 10 || i4 == 13;
        }

        boolean k(int i4) {
            return i4 == 32 || i4 == 10 || i4 == 13 || i4 == 9;
        }

        Integer l() {
            int i4 = this.f41948b;
            if (i4 == this.f41949c) {
                return null;
            }
            String str = this.f41947a;
            this.f41948b = i4 + 1;
            return Integer.valueOf(str.charAt(i4));
        }

        Boolean m() {
            int i4 = this.f41948b;
            if (i4 == this.f41949c) {
                return null;
            }
            char charAt = this.f41947a.charAt(i4);
            if (charAt != '0' && charAt != '1') {
                return null;
            }
            this.f41948b++;
            return Boolean.valueOf(charAt == '1');
        }

        float n() {
            float b4 = this.f41950d.b(this.f41947a, this.f41948b, this.f41949c);
            if (!Float.isNaN(b4)) {
                this.f41948b = this.f41950d.a();
            }
            return b4;
        }

        String o() {
            if (h()) {
                return null;
            }
            int i4 = this.f41948b;
            int charAt = this.f41947a.charAt(i4);
            while (true) {
                if ((charAt < 97 || charAt > 122) && (charAt < 65 || charAt > 90)) {
                    break;
                }
                charAt = a();
            }
            int i5 = this.f41948b;
            while (k(charAt)) {
                charAt = a();
            }
            if (charAt == 40) {
                this.f41948b++;
                return this.f41947a.substring(i4, i5);
            }
            this.f41948b = i4;
            return null;
        }

        C3276g.C3291p p() {
            float n4 = n();
            if (Float.isNaN(n4)) {
                return null;
            }
            C3276g.d0 v4 = v();
            return v4 == null ? new C3276g.C3291p(n4, C3276g.d0.px) : new C3276g.C3291p(n4, v4);
        }

        String q() {
            if (h()) {
                return null;
            }
            int i4 = this.f41948b;
            char charAt = this.f41947a.charAt(i4);
            if (charAt != '\'' && charAt != '\"') {
                return null;
            }
            int a4 = a();
            while (a4 != -1 && a4 != charAt) {
                a4 = a();
            }
            if (a4 == -1) {
                this.f41948b = i4;
                return null;
            }
            int i5 = this.f41948b;
            this.f41948b = i5 + 1;
            return this.f41947a.substring(i4 + 1, i5);
        }

        String r() {
            return t(' ', false);
        }

        String s(char c4) {
            return t(c4, false);
        }

        String t(char c4, boolean z4) {
            if (h()) {
                return null;
            }
            char charAt = this.f41947a.charAt(this.f41948b);
            if ((!z4 && k(charAt)) || charAt == c4) {
                return null;
            }
            int i4 = this.f41948b;
            int a4 = a();
            while (a4 != -1 && a4 != c4 && (z4 || !k(a4))) {
                a4 = a();
            }
            return this.f41947a.substring(i4, this.f41948b);
        }

        String u(char c4) {
            return t(c4, true);
        }

        C3276g.d0 v() {
            if (h()) {
                return null;
            }
            if (this.f41947a.charAt(this.f41948b) == '%') {
                this.f41948b++;
                return C3276g.d0.percent;
            }
            int i4 = this.f41948b;
            if (i4 > this.f41949c - 2) {
                return null;
            }
            try {
                C3276g.d0 valueOf = C3276g.d0.valueOf(this.f41947a.substring(i4, i4 + 2).toLowerCase(Locale.US));
                this.f41948b += 2;
                return valueOf;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        String w() {
            if (h()) {
                return null;
            }
            int i4 = this.f41948b;
            char charAt = this.f41947a.charAt(i4);
            if ((charAt < 'A' || charAt > 'Z') && (charAt < 'a' || charAt > 'z')) {
                this.f41948b = i4;
                return null;
            }
            int a4 = a();
            while (true) {
                if ((a4 < 65 || a4 > 90) && (a4 < 97 || a4 > 122)) {
                    break;
                }
                a4 = a();
            }
            return this.f41947a.substring(i4, this.f41948b);
        }

        float x() {
            z();
            float b4 = this.f41950d.b(this.f41947a, this.f41948b, this.f41949c);
            if (!Float.isNaN(b4)) {
                this.f41948b = this.f41950d.a();
            }
            return b4;
        }

        String y() {
            if (h()) {
                return null;
            }
            int i4 = this.f41948b;
            this.f41948b = this.f41949c;
            return this.f41947a.substring(i4);
        }

        boolean z() {
            A();
            int i4 = this.f41948b;
            if (i4 == this.f41949c || this.f41947a.charAt(i4) != ',') {
                return false;
            }
            this.f41948b++;
            A();
            return true;
        }
    }

    /* renamed from: o0.k$j */
    private class j implements Attributes {

        /* renamed from: a, reason: collision with root package name */
        private XmlPullParser f41951a;

        public j(XmlPullParser xmlPullParser) {
            this.f41951a = xmlPullParser;
        }

        @Override // org.xml.sax.Attributes
        public int getIndex(String str, String str2) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public int getLength() {
            return this.f41951a.getAttributeCount();
        }

        @Override // org.xml.sax.Attributes
        public String getLocalName(int i4) {
            return this.f41951a.getAttributeName(i4);
        }

        @Override // org.xml.sax.Attributes
        public String getQName(int i4) {
            String attributeName = this.f41951a.getAttributeName(i4);
            if (this.f41951a.getAttributePrefix(i4) == null) {
                return attributeName;
            }
            return this.f41951a.getAttributePrefix(i4) + ':' + attributeName;
        }

        @Override // org.xml.sax.Attributes
        public String getType(int i4) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getURI(int i4) {
            return this.f41951a.getAttributeNamespace(i4);
        }

        @Override // org.xml.sax.Attributes
        public String getValue(int i4) {
            return this.f41951a.getAttributeValue(i4);
        }

        @Override // org.xml.sax.Attributes
        public int getIndex(String str) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public String getType(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getValue(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getType(String str) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getValue(String str) {
            return null;
        }
    }

    C3305k() {
    }

    private void A(C3276g.C3280d c3280d, Attributes attributes) {
        for (int i4 = 0; i4 < attributes.getLength(); i4++) {
            String trim = attributes.getValue(i4).trim();
            switch (a.f41813b[g.a(attributes.getLocalName(i4)).ordinal()]) {
                case 12:
                    c3280d.f41668o = o0(trim);
                    break;
                case 13:
                    c3280d.f41669p = o0(trim);
                    break;
                case 14:
                    C3276g.C3291p o02 = o0(trim);
                    c3280d.f41670q = o02;
                    if (o02.h()) {
                        throw new C3304j("Invalid <circle> element. r cannot be negative");
                    }
                    break;
            }
        }
    }

    private static Set A0(String str) {
        i iVar = new i(str);
        HashSet hashSet = new HashSet();
        while (!iVar.h()) {
            hashSet.add(iVar.r());
            iVar.A();
        }
        return hashSet;
    }

    private void B(C3276g.C3281e c3281e, Attributes attributes) {
        for (int i4 = 0; i4 < attributes.getLength(); i4++) {
            String trim = attributes.getValue(i4).trim();
            if (a.f41813b[g.a(attributes.getLocalName(i4)).ordinal()] == 38) {
                if ("objectBoundingBox".equals(trim)) {
                    c3281e.f41681p = Boolean.FALSE;
                } else {
                    if (!"userSpaceOnUse".equals(trim)) {
                        throw new C3304j("Invalid value for attribute clipPathUnits");
                    }
                    c3281e.f41681p = Boolean.TRUE;
                }
            }
        }
    }

    private static C3276g.C3291p[] B0(String str) {
        C3276g.C3291p p4;
        i iVar = new i(str);
        iVar.A();
        if (iVar.h() || (p4 = iVar.p()) == null || p4.h()) {
            return null;
        }
        float a4 = p4.a();
        ArrayList arrayList = new ArrayList();
        arrayList.add(p4);
        while (!iVar.h()) {
            iVar.z();
            C3276g.C3291p p5 = iVar.p();
            if (p5 == null || p5.h()) {
                return null;
            }
            arrayList.add(p5);
            a4 += p5.a();
        }
        if (a4 == 0.0f) {
            return null;
        }
        return (C3276g.C3291p[]) arrayList.toArray(new C3276g.C3291p[arrayList.size()]);
    }

    private void C(C3276g.G g4, Attributes attributes) {
        for (int i4 = 0; i4 < attributes.getLength(); i4++) {
            String trim = attributes.getValue(i4).trim();
            switch (a.f41813b[g.a(attributes.getLocalName(i4)).ordinal()]) {
                case 21:
                    g4.f(z0(trim));
                    break;
                case 22:
                    g4.g(trim);
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    g4.j(F0(trim));
                    break;
                case 24:
                    g4.b(A0(trim));
                    break;
                case 25:
                    List i02 = i0(trim);
                    g4.d(i02 != null ? new HashSet(i02) : new HashSet(0));
                    break;
            }
        }
    }

    private static C3276g.E.c C0(String str) {
        if ("butt".equals(str)) {
            return C3276g.E.c.Butt;
        }
        if ("round".equals(str)) {
            return C3276g.E.c.Round;
        }
        if ("square".equals(str)) {
            return C3276g.E.c.Square;
        }
        return null;
    }

    private void D(C3276g.L l4, Attributes attributes) {
        for (int i4 = 0; i4 < attributes.getLength(); i4++) {
            String qName = attributes.getQName(i4);
            if (qName.equals("id") || qName.equals("xml:id")) {
                l4.f41628c = attributes.getValue(i4).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String trim = attributes.getValue(i4).trim();
                if ("default".equals(trim)) {
                    l4.f41629d = Boolean.FALSE;
                    return;
                } else {
                    if ("preserve".equals(trim)) {
                        l4.f41629d = Boolean.TRUE;
                        return;
                    }
                    throw new C3304j("Invalid value for \"xml:space\" attribute: " + trim);
                }
            }
        }
    }

    private static C3276g.E.d D0(String str) {
        if ("miter".equals(str)) {
            return C3276g.E.d.Miter;
        }
        if ("round".equals(str)) {
            return C3276g.E.d.Round;
        }
        if ("bevel".equals(str)) {
            return C3276g.E.d.Bevel;
        }
        return null;
    }

    private void E(C3276g.C3284i c3284i, Attributes attributes) {
        for (int i4 = 0; i4 < attributes.getLength(); i4++) {
            String trim = attributes.getValue(i4).trim();
            switch (a.f41813b[g.a(attributes.getLocalName(i4)).ordinal()]) {
                case 10:
                    C3276g.C3291p o02 = o0(trim);
                    c3284i.f41693q = o02;
                    if (o02.h()) {
                        throw new C3304j("Invalid <ellipse> element. rx cannot be negative");
                    }
                    break;
                case 11:
                    C3276g.C3291p o03 = o0(trim);
                    c3284i.f41694r = o03;
                    if (o03.h()) {
                        throw new C3304j("Invalid <ellipse> element. ry cannot be negative");
                    }
                    break;
                case 12:
                    c3284i.f41691o = o0(trim);
                    break;
                case 13:
                    c3284i.f41692p = o0(trim);
                    break;
            }
        }
    }

    private static void E0(C3276g.L l4, String str) {
        i iVar = new i(str.replaceAll("/\\*.*?\\*/", ""));
        while (true) {
            String s4 = iVar.s(':');
            iVar.A();
            if (!iVar.f(':')) {
                return;
            }
            iVar.A();
            String u4 = iVar.u(';');
            if (u4 == null) {
                return;
            }
            iVar.A();
            if (iVar.h() || iVar.f(';')) {
                if (l4.f41631f == null) {
                    l4.f41631f = new C3276g.E();
                }
                S0(l4.f41631f, s4, u4);
                iVar.A();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void F(C3276g.AbstractC3285j abstractC3285j, Attributes attributes) {
        for (int i4 = 0; i4 < attributes.getLength(); i4++) {
            String trim = attributes.getValue(i4).trim();
            int i5 = a.f41813b[g.a(attributes.getLocalName(i4)).ordinal()];
            if (i5 != 6) {
                switch (i5) {
                    case 32:
                        if (!"objectBoundingBox".equals(trim)) {
                            if (!"userSpaceOnUse".equals(trim)) {
                                throw new C3304j("Invalid value for attribute gradientUnits");
                            }
                            abstractC3285j.f41696i = Boolean.TRUE;
                            break;
                        } else {
                            abstractC3285j.f41696i = Boolean.FALSE;
                            break;
                        }
                    case 33:
                        abstractC3285j.f41697j = J0(trim);
                        break;
                    case 34:
                        try {
                            abstractC3285j.f41698k = C3276g.EnumC3286k.valueOf(trim);
                            break;
                        } catch (IllegalArgumentException unused) {
                            throw new C3304j("Invalid spreadMethod attribute. \"" + trim + "\" is not a valid value.");
                        }
                }
            } else if ("".equals(attributes.getURI(i4)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i4))) {
                abstractC3285j.f41699l = trim;
            }
        }
    }

    private static Set F0(String str) {
        i iVar = new i(str);
        HashSet hashSet = new HashSet();
        while (!iVar.h()) {
            String r4 = iVar.r();
            int indexOf = r4.indexOf(45);
            if (indexOf != -1) {
                r4 = r4.substring(0, indexOf);
            }
            hashSet.add(new Locale(r4, "", "").getLanguage());
            iVar.A();
        }
        return hashSet;
    }

    private void G(C3276g.C3290o c3290o, Attributes attributes) {
        for (int i4 = 0; i4 < attributes.getLength(); i4++) {
            String trim = attributes.getValue(i4).trim();
            int i5 = a.f41813b[g.a(attributes.getLocalName(i4)).ordinal()];
            if (i5 == 1) {
                c3290o.f41707q = o0(trim);
            } else if (i5 == 2) {
                c3290o.f41708r = o0(trim);
            } else if (i5 == 3) {
                C3276g.C3291p o02 = o0(trim);
                c3290o.f41709s = o02;
                if (o02.h()) {
                    throw new C3304j("Invalid <use> element. width cannot be negative");
                }
            } else if (i5 == 4) {
                C3276g.C3291p o03 = o0(trim);
                c3290o.f41710t = o03;
                if (o03.h()) {
                    throw new C3304j("Invalid <use> element. height cannot be negative");
                }
            } else if (i5 != 6) {
                if (i5 == 7) {
                    w0(c3290o, trim);
                }
            } else if ("".equals(attributes.getURI(i4)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i4))) {
                c3290o.f41706p = trim;
            }
        }
    }

    private static C3276g.E.f G0(String str) {
        str.getClass();
        switch (str) {
            case "middle":
                return C3276g.E.f.Middle;
            case "end":
                return C3276g.E.f.End;
            case "start":
                return C3276g.E.f.Start;
            default:
                return null;
        }
    }

    private void H(C3276g.C3292q c3292q, Attributes attributes) {
        for (int i4 = 0; i4 < attributes.getLength(); i4++) {
            String trim = attributes.getValue(i4).trim();
            switch (a.f41813b[g.a(attributes.getLocalName(i4)).ordinal()]) {
                case 15:
                    c3292q.f41714o = o0(trim);
                    break;
                case 16:
                    c3292q.f41715p = o0(trim);
                    break;
                case 17:
                    c3292q.f41716q = o0(trim);
                    break;
                case 18:
                    c3292q.f41717r = o0(trim);
                    break;
            }
        }
    }

    private static C3276g.E.EnumC0238g H0(String str) {
        str.getClass();
        switch (str) {
            case "line-through":
                return C3276g.E.EnumC0238g.LineThrough;
            case "underline":
                return C3276g.E.EnumC0238g.Underline;
            case "none":
                return C3276g.E.EnumC0238g.None;
            case "blink":
                return C3276g.E.EnumC0238g.Blink;
            case "overline":
                return C3276g.E.EnumC0238g.Overline;
            default:
                return null;
        }
    }

    private void I(C3276g.M m4, Attributes attributes) {
        for (int i4 = 0; i4 < attributes.getLength(); i4++) {
            String trim = attributes.getValue(i4).trim();
            switch (a.f41813b[g.a(attributes.getLocalName(i4)).ordinal()]) {
                case 15:
                    m4.f41633m = o0(trim);
                    break;
                case 16:
                    m4.f41634n = o0(trim);
                    break;
                case 17:
                    m4.f41635o = o0(trim);
                    break;
                case 18:
                    m4.f41636p = o0(trim);
                    break;
            }
        }
    }

    private static C3276g.E.h I0(String str) {
        str.getClass();
        if (str.equals("ltr")) {
            return C3276g.E.h.LTR;
        }
        if (str.equals("rtl")) {
            return C3276g.E.h.RTL;
        }
        return null;
    }

    private void J(C3276g.C3293r c3293r, Attributes attributes) {
        for (int i4 = 0; i4 < attributes.getLength(); i4++) {
            String trim = attributes.getValue(i4).trim();
            switch (a.f41813b[g.a(attributes.getLocalName(i4)).ordinal()]) {
                case 26:
                    c3293r.f41719r = o0(trim);
                    break;
                case 27:
                    c3293r.f41720s = o0(trim);
                    break;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    C3276g.C3291p o02 = o0(trim);
                    c3293r.f41721t = o02;
                    if (o02.h()) {
                        throw new C3304j("Invalid <marker> element. markerWidth cannot be negative");
                    }
                    break;
                case 29:
                    C3276g.C3291p o03 = o0(trim);
                    c3293r.f41722u = o03;
                    if (o03.h()) {
                        throw new C3304j("Invalid <marker> element. markerHeight cannot be negative");
                    }
                    break;
                case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                    if (!"strokeWidth".equals(trim)) {
                        if (!"userSpaceOnUse".equals(trim)) {
                            throw new C3304j("Invalid value for attribute markerUnits");
                        }
                        c3293r.f41718q = true;
                        break;
                    } else {
                        c3293r.f41718q = false;
                        break;
                    }
                case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                    if ("auto".equals(trim)) {
                        c3293r.f41723v = Float.valueOf(Float.NaN);
                        break;
                    } else {
                        c3293r.f41723v = Float.valueOf(f0(trim));
                        break;
                    }
            }
        }
    }

    private Matrix J0(String str) {
        Matrix matrix = new Matrix();
        i iVar = new i(str);
        iVar.A();
        while (!iVar.h()) {
            String o4 = iVar.o();
            if (o4 == null) {
                throw new C3304j("Bad transform function encountered in transform list: " + str);
            }
            switch (o4) {
                case "matrix":
                    iVar.A();
                    float n4 = iVar.n();
                    iVar.z();
                    float n5 = iVar.n();
                    iVar.z();
                    float n6 = iVar.n();
                    iVar.z();
                    float n7 = iVar.n();
                    iVar.z();
                    float n8 = iVar.n();
                    iVar.z();
                    float n9 = iVar.n();
                    iVar.A();
                    if (!Float.isNaN(n9) && iVar.f(')')) {
                        Matrix matrix2 = new Matrix();
                        matrix2.setValues(new float[]{n4, n6, n8, n5, n7, n9, 0.0f, 0.0f, 1.0f});
                        matrix.preConcat(matrix2);
                        break;
                    } else {
                        throw new C3304j("Invalid transform list: " + str);
                    }
                    break;
                case "rotate":
                    iVar.A();
                    float n10 = iVar.n();
                    float x4 = iVar.x();
                    float x5 = iVar.x();
                    iVar.A();
                    if (Float.isNaN(n10) || !iVar.f(')')) {
                        throw new C3304j("Invalid transform list: " + str);
                    }
                    if (Float.isNaN(x4)) {
                        matrix.preRotate(n10);
                        break;
                    } else if (!Float.isNaN(x5)) {
                        matrix.preRotate(n10, x4, x5);
                        break;
                    } else {
                        throw new C3304j("Invalid transform list: " + str);
                    }
                case "scale":
                    iVar.A();
                    float n11 = iVar.n();
                    float x6 = iVar.x();
                    iVar.A();
                    if (!Float.isNaN(n11) && iVar.f(')')) {
                        if (!Float.isNaN(x6)) {
                            matrix.preScale(n11, x6);
                            break;
                        } else {
                            matrix.preScale(n11, n11);
                            break;
                        }
                    } else {
                        throw new C3304j("Invalid transform list: " + str);
                    }
                    break;
                case "skewX":
                    iVar.A();
                    float n12 = iVar.n();
                    iVar.A();
                    if (!Float.isNaN(n12) && iVar.f(')')) {
                        matrix.preSkew((float) Math.tan(Math.toRadians(n12)), 0.0f);
                        break;
                    } else {
                        throw new C3304j("Invalid transform list: " + str);
                    }
                    break;
                case "skewY":
                    iVar.A();
                    float n13 = iVar.n();
                    iVar.A();
                    if (!Float.isNaN(n13) && iVar.f(')')) {
                        matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians(n13)));
                        break;
                    } else {
                        throw new C3304j("Invalid transform list: " + str);
                    }
                case "translate":
                    iVar.A();
                    float n14 = iVar.n();
                    float x7 = iVar.x();
                    iVar.A();
                    if (!Float.isNaN(n14) && iVar.f(')')) {
                        if (!Float.isNaN(x7)) {
                            matrix.preTranslate(n14, x7);
                            break;
                        } else {
                            matrix.preTranslate(n14, 0.0f);
                            break;
                        }
                    } else {
                        throw new C3304j("Invalid transform list: " + str);
                    }
                    break;
                default:
                    throw new C3304j("Invalid transform list fn: " + o4 + ")");
            }
            if (iVar.h()) {
                return matrix;
            }
            iVar.z();
        }
        return matrix;
    }

    private void K(C3276g.C3294s c3294s, Attributes attributes) {
        for (int i4 = 0; i4 < attributes.getLength(); i4++) {
            String trim = attributes.getValue(i4).trim();
            int i5 = a.f41813b[g.a(attributes.getLocalName(i4)).ordinal()];
            if (i5 == 1) {
                c3294s.f41726q = o0(trim);
            } else if (i5 == 2) {
                c3294s.f41727r = o0(trim);
            } else if (i5 == 3) {
                C3276g.C3291p o02 = o0(trim);
                c3294s.f41728s = o02;
                if (o02.h()) {
                    throw new C3304j("Invalid <mask> element. width cannot be negative");
                }
            } else if (i5 == 4) {
                C3276g.C3291p o03 = o0(trim);
                c3294s.f41729t = o03;
                if (o03.h()) {
                    throw new C3304j("Invalid <mask> element. height cannot be negative");
                }
            } else if (i5 != 43) {
                if (i5 != 44) {
                    continue;
                } else if ("objectBoundingBox".equals(trim)) {
                    c3294s.f41725p = Boolean.FALSE;
                } else {
                    if (!"userSpaceOnUse".equals(trim)) {
                        throw new C3304j("Invalid value for attribute maskContentUnits");
                    }
                    c3294s.f41725p = Boolean.TRUE;
                }
            } else if ("objectBoundingBox".equals(trim)) {
                c3294s.f41724o = Boolean.FALSE;
            } else {
                if (!"userSpaceOnUse".equals(trim)) {
                    throw new C3304j("Invalid value for attribute maskUnits");
                }
                c3294s.f41724o = Boolean.TRUE;
            }
        }
    }

    private void K0(InputStream inputStream) {
        Log.d("SVGParser", "Falling back to SAX parser");
        try {
            SAXParserFactory newInstance = SAXParserFactory.newInstance();
            newInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            newInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = newInstance.newSAXParser().getXMLReader();
            f fVar = new f(this, null);
            xMLReader.setContentHandler(fVar);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", fVar);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e4) {
            throw new C3304j("Stream error", e4);
        } catch (ParserConfigurationException e5) {
            throw new C3304j("XML parser problem", e5);
        } catch (SAXException e6) {
            throw new C3304j("SVG parse error", e6);
        }
    }

    private void L(C3276g.C3297v c3297v, Attributes attributes) {
        for (int i4 = 0; i4 < attributes.getLength(); i4++) {
            String trim = attributes.getValue(i4).trim();
            int i5 = a.f41813b[g.a(attributes.getLocalName(i4)).ordinal()];
            if (i5 == 8) {
                c3297v.f41732o = u0(trim);
            } else if (i5 != 9) {
                continue;
            } else {
                Float valueOf = Float.valueOf(f0(trim));
                c3297v.f41733p = valueOf;
                if (valueOf.floatValue() < 0.0f) {
                    throw new C3304j("Invalid <path> element. pathLength cannot be negative");
                }
            }
        }
    }

    private void L0(InputStream inputStream, boolean z4) {
        try {
            try {
                XmlPullParser newPullParser = Xml.newPullParser();
                j jVar = new j(newPullParser);
                newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                newPullParser.setInput(inputStream, null);
                for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.nextToken()) {
                    if (eventType == 0) {
                        W0();
                    } else if (eventType == 8) {
                        Log.d("SVGParser", "PROC INSTR: " + newPullParser.getText());
                        i iVar = new i(newPullParser.getText());
                        r(iVar.r(), x0(iVar));
                    } else if (eventType != 10) {
                        if (eventType == 2) {
                            String name = newPullParser.getName();
                            if (newPullParser.getPrefix() != null) {
                                name = newPullParser.getPrefix() + ':' + name;
                            }
                            X0(newPullParser.getNamespace(), newPullParser.getName(), name, jVar);
                        } else if (eventType == 3) {
                            String name2 = newPullParser.getName();
                            if (newPullParser.getPrefix() != null) {
                                name2 = newPullParser.getPrefix() + ':' + name2;
                            }
                            p(newPullParser.getNamespace(), newPullParser.getName(), name2);
                        } else if (eventType == 4) {
                            int[] iArr = new int[2];
                            e1(newPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                        } else if (eventType == 5) {
                            c1(newPullParser.getText());
                        }
                    } else if (z4 && this.f41803a.m() == null && newPullParser.getText().contains("<!ENTITY ")) {
                        try {
                            Log.d("SVGParser", "Switching to SAX parser to process entities");
                            inputStream.reset();
                            K0(inputStream);
                            return;
                        } catch (IOException unused) {
                            Log.w("SVGParser", "Detected internal entity definitions, but could not parse them.");
                            return;
                        }
                    }
                }
                o();
            } catch (IOException e4) {
                throw new C3304j("Stream error", e4);
            }
        } catch (XmlPullParserException e5) {
            throw new C3304j("XML parser problem", e5);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cf, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void M(C3276g.C3300y c3300y, Attributes attributes) {
        for (int i4 = 0; i4 < attributes.getLength(); i4++) {
            String trim = attributes.getValue(i4).trim();
            int i5 = a.f41813b[g.a(attributes.getLocalName(i4)).ordinal()];
            if (i5 == 1) {
                c3300y.f41741t = o0(trim);
            } else if (i5 == 2) {
                c3300y.f41742u = o0(trim);
            } else if (i5 == 3) {
                C3276g.C3291p o02 = o0(trim);
                c3300y.f41743v = o02;
                if (o02.h()) {
                    throw new C3304j("Invalid <pattern> element. width cannot be negative");
                }
            } else if (i5 == 4) {
                C3276g.C3291p o03 = o0(trim);
                c3300y.f41744w = o03;
                if (o03.h()) {
                    throw new C3304j("Invalid <pattern> element. height cannot be negative");
                }
            } else if (i5 != 6) {
                switch (i5) {
                    case 40:
                        if (!"objectBoundingBox".equals(trim)) {
                            if (!"userSpaceOnUse".equals(trim)) {
                                throw new C3304j("Invalid value for attribute patternUnits");
                            }
                            c3300y.f41738q = Boolean.TRUE;
                            break;
                        } else {
                            c3300y.f41738q = Boolean.FALSE;
                            break;
                        }
                    case 41:
                        if (!"objectBoundingBox".equals(trim)) {
                            if (!"userSpaceOnUse".equals(trim)) {
                                throw new C3304j("Invalid value for attribute patternContentUnits");
                            }
                            c3300y.f41739r = Boolean.TRUE;
                            break;
                        } else {
                            c3300y.f41739r = Boolean.FALSE;
                            break;
                        }
                    case 42:
                        c3300y.f41740s = J0(trim);
                        break;
                }
            } else if ("".equals(attributes.getURI(i4)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i4))) {
                c3300y.f41745x = trim;
            }
        }
    }

    private static C3276g.E.i M0(String str) {
        str.getClass();
        if (str.equals("none")) {
            return C3276g.E.i.None;
        }
        if (str.equals("non-scaling-stroke")) {
            return C3276g.E.i.NonScalingStroke;
        }
        return null;
    }

    private void N(C3276g.C3301z c3301z, Attributes attributes, String str) {
        for (int i4 = 0; i4 < attributes.getLength(); i4++) {
            if (g.a(attributes.getLocalName(i4)) == g.points) {
                i iVar = new i(attributes.getValue(i4));
                ArrayList arrayList = new ArrayList();
                iVar.A();
                while (!iVar.h()) {
                    float n4 = iVar.n();
                    if (Float.isNaN(n4)) {
                        throw new C3304j("Invalid <" + str + "> points attribute. Non-coordinate content found in list.");
                    }
                    iVar.z();
                    float n5 = iVar.n();
                    if (Float.isNaN(n5)) {
                        throw new C3304j("Invalid <" + str + "> points attribute. There should be an even number of coordinates.");
                    }
                    iVar.z();
                    arrayList.add(Float.valueOf(n4));
                    arrayList.add(Float.valueOf(n5));
                }
                c3301z.f41746o = new float[arrayList.size()];
                int size = arrayList.size();
                int i5 = 0;
                int i6 = 0;
                while (i6 < size) {
                    Object obj = arrayList.get(i6);
                    i6++;
                    c3301z.f41746o[i5] = ((Float) obj).floatValue();
                    i5++;
                }
            }
        }
    }

    private static C3276g.C3278b N0(String str) {
        i iVar = new i(str);
        iVar.A();
        float n4 = iVar.n();
        iVar.z();
        float n5 = iVar.n();
        iVar.z();
        float n6 = iVar.n();
        iVar.z();
        float n7 = iVar.n();
        if (Float.isNaN(n4) || Float.isNaN(n5) || Float.isNaN(n6) || Float.isNaN(n7)) {
            throw new C3304j("Invalid viewBox definition - should have four numbers");
        }
        if (n6 < 0.0f) {
            throw new C3304j("Invalid viewBox. width cannot be negative");
        }
        if (n7 >= 0.0f) {
            return new C3276g.C3278b(n4, n5, n6, n7);
        }
        throw new C3304j("Invalid viewBox. height cannot be negative");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void O(C3276g.Q q4, Attributes attributes) {
        for (int i4 = 0; i4 < attributes.getLength(); i4++) {
            String trim = attributes.getValue(i4).trim();
            int i5 = a.f41813b[g.a(attributes.getLocalName(i4)).ordinal()];
            if (i5 == 35) {
                q4.f41643p = o0(trim);
            } else if (i5 != 36) {
                switch (i5) {
                    case 12:
                        q4.f41640m = o0(trim);
                        break;
                    case 13:
                        q4.f41641n = o0(trim);
                        break;
                    case 14:
                        C3276g.C3291p o02 = o0(trim);
                        q4.f41642o = o02;
                        if (o02.h()) {
                            throw new C3304j("Invalid <radialGradient> element. r cannot be negative");
                        }
                        break;
                }
            } else {
                q4.f41644q = o0(trim);
            }
        }
    }

    private void O0(Attributes attributes) {
        l("<path>", new Object[0]);
        if (this.f41804b == null) {
            throw new C3304j("Invalid document. Root element must be <svg>");
        }
        C3276g.C3297v c3297v = new C3276g.C3297v();
        c3297v.f41637a = this.f41803a;
        c3297v.f41638b = this.f41804b;
        D(c3297v, attributes);
        S(c3297v, attributes);
        W(c3297v, attributes);
        C(c3297v, attributes);
        L(c3297v, attributes);
        this.f41804b.h(c3297v);
    }

    private void P(C3276g.B b4, Attributes attributes) {
        for (int i4 = 0; i4 < attributes.getLength(); i4++) {
            String trim = attributes.getValue(i4).trim();
            int i5 = a.f41813b[g.a(attributes.getLocalName(i4)).ordinal()];
            if (i5 == 1) {
                b4.f41530o = o0(trim);
            } else if (i5 == 2) {
                b4.f41531p = o0(trim);
            } else if (i5 == 3) {
                C3276g.C3291p o02 = o0(trim);
                b4.f41532q = o02;
                if (o02.h()) {
                    throw new C3304j("Invalid <rect> element. width cannot be negative");
                }
            } else if (i5 == 4) {
                C3276g.C3291p o03 = o0(trim);
                b4.f41533r = o03;
                if (o03.h()) {
                    throw new C3304j("Invalid <rect> element. height cannot be negative");
                }
            } else if (i5 == 10) {
                C3276g.C3291p o04 = o0(trim);
                b4.f41534s = o04;
                if (o04.h()) {
                    throw new C3304j("Invalid <rect> element. rx cannot be negative");
                }
            } else if (i5 != 11) {
                continue;
            } else {
                C3276g.C3291p o05 = o0(trim);
                b4.f41535t = o05;
                if (o05.h()) {
                    throw new C3304j("Invalid <rect> element. ry cannot be negative");
                }
            }
        }
    }

    private void P0(Attributes attributes) {
        l("<pattern>", new Object[0]);
        if (this.f41804b == null) {
            throw new C3304j("Invalid document. Root element must be <svg>");
        }
        C3276g.C3300y c3300y = new C3276g.C3300y();
        c3300y.f41637a = this.f41803a;
        c3300y.f41638b = this.f41804b;
        D(c3300y, attributes);
        S(c3300y, attributes);
        C(c3300y, attributes);
        Y(c3300y, attributes);
        M(c3300y, attributes);
        this.f41804b.h(c3300y);
        this.f41804b = c3300y;
    }

    private void Q(C3276g.F f4, Attributes attributes) {
        for (int i4 = 0; i4 < attributes.getLength(); i4++) {
            String trim = attributes.getValue(i4).trim();
            int i5 = a.f41813b[g.a(attributes.getLocalName(i4)).ordinal()];
            if (i5 == 1) {
                f4.f41611q = o0(trim);
            } else if (i5 == 2) {
                f4.f41612r = o0(trim);
            } else if (i5 == 3) {
                C3276g.C3291p o02 = o0(trim);
                f4.f41613s = o02;
                if (o02.h()) {
                    throw new C3304j("Invalid <svg> element. width cannot be negative");
                }
            } else if (i5 == 4) {
                C3276g.C3291p o03 = o0(trim);
                f4.f41614t = o03;
                if (o03.h()) {
                    throw new C3304j("Invalid <svg> element. height cannot be negative");
                }
            } else if (i5 == 5) {
                f4.f41615u = trim;
            }
        }
    }

    private void Q0(Attributes attributes) {
        l("<polygon>", new Object[0]);
        if (this.f41804b == null) {
            throw new C3304j("Invalid document. Root element must be <svg>");
        }
        C3276g.C3301z a4 = new C3276g.A();
        a4.f41637a = this.f41803a;
        a4.f41638b = this.f41804b;
        D(a4, attributes);
        S(a4, attributes);
        W(a4, attributes);
        C(a4, attributes);
        N(a4, attributes, "polygon");
        this.f41804b.h(a4);
    }

    private void R(C3276g.D d4, Attributes attributes) {
        for (int i4 = 0; i4 < attributes.getLength(); i4++) {
            String trim = attributes.getValue(i4).trim();
            if (a.f41813b[g.a(attributes.getLocalName(i4)).ordinal()] == 37) {
                d4.f41536h = n0(trim);
            }
        }
    }

    private void R0(Attributes attributes) {
        l("<polyline>", new Object[0]);
        if (this.f41804b == null) {
            throw new C3304j("Invalid document. Root element must be <svg>");
        }
        C3276g.C3301z c3301z = new C3276g.C3301z();
        c3301z.f41637a = this.f41803a;
        c3301z.f41638b = this.f41804b;
        D(c3301z, attributes);
        S(c3301z, attributes);
        W(c3301z, attributes);
        C(c3301z, attributes);
        N(c3301z, attributes, "polyline");
        this.f41804b.h(c3301z);
    }

    private void S(C3276g.L l4, Attributes attributes) {
        for (int i4 = 0; i4 < attributes.getLength(); i4++) {
            String trim = attributes.getValue(i4).trim();
            if (trim.length() != 0) {
                int i5 = a.f41813b[g.a(attributes.getLocalName(i4)).ordinal()];
                if (i5 == 45) {
                    E0(l4, trim);
                } else if (i5 != 46) {
                    if (l4.f41630e == null) {
                        l4.f41630e = new C3276g.E();
                    }
                    S0(l4.f41630e, attributes.getLocalName(i4), attributes.getValue(i4).trim());
                } else {
                    l4.f41632g = C3271b.f(trim);
                }
            }
        }
    }

    static void S0(C3276g.E e4, String str, String str2) {
        if (str2.length() == 0 || str2.equals("inherit")) {
            return;
        }
        try {
            switch (a.f41813b[g.a(str).ordinal()]) {
                case 47:
                    C3276g.O t02 = t0(str2);
                    e4.f41552c = t02;
                    if (t02 != null) {
                        e4.f41551b |= 1;
                        break;
                    }
                    break;
                case 48:
                    C3276g.E.a e02 = e0(str2);
                    e4.f41553d = e02;
                    if (e02 != null) {
                        e4.f41551b |= 2;
                        break;
                    }
                    break;
                case 49:
                    Float r02 = r0(str2);
                    e4.f41554e = r02;
                    if (r02 != null) {
                        e4.f41551b |= 4;
                        break;
                    }
                    break;
                case 50:
                    C3276g.O t03 = t0(str2);
                    e4.f41555f = t03;
                    if (t03 != null) {
                        e4.f41551b |= 8;
                        break;
                    }
                    break;
                case IronSourceConstants.SET_META_DATA_AFTER_INIT /* 51 */:
                    Float r03 = r0(str2);
                    e4.f41556g = r03;
                    if (r03 != null) {
                        e4.f41551b |= 16;
                        break;
                    }
                    break;
                case IronSourceConstants.SET_USER_ID /* 52 */:
                    e4.f41557h = o0(str2);
                    e4.f41551b |= 32;
                    break;
                case IronSourceConstants.SET_WATERFALL_CONFIGURATION /* 53 */:
                    C3276g.E.c C02 = C0(str2);
                    e4.f41558i = C02;
                    if (C02 != null) {
                        e4.f41551b |= 64;
                        break;
                    }
                    break;
                case IronSourceConstants.REGISTER_TRIGGER /* 54 */:
                    C3276g.E.d D02 = D0(str2);
                    e4.f41559j = D02;
                    if (D02 != null) {
                        e4.f41551b |= 128;
                        break;
                    }
                    break;
                case IronSourceConstants.REGISTER_TRIGGER_SUCCESS /* 55 */:
                    e4.f41560k = Float.valueOf(f0(str2));
                    e4.f41551b |= 256;
                    break;
                case IronSourceConstants.REGISTER_TRIGGER_FAIL /* 56 */:
                    if (!"none".equals(str2)) {
                        C3276g.C3291p[] B02 = B0(str2);
                        e4.f41561l = B02;
                        if (B02 != null) {
                            e4.f41551b |= 512;
                            break;
                        }
                    } else {
                        e4.f41561l = null;
                        e4.f41551b |= 512;
                        break;
                    }
                    break;
                case IronSourceConstants.SET_NETWORK_DATA /* 57 */:
                    e4.f41562m = o0(str2);
                    e4.f41551b |= 1024;
                    break;
                case 58:
                    e4.f41563n = r0(str2);
                    e4.f41551b |= 2048;
                    break;
                case 59:
                    e4.f41564o = b0(str2);
                    e4.f41551b |= 4096;
                    break;
                case 60:
                    h0(e4, str2);
                    break;
                case 61:
                    List i02 = i0(str2);
                    e4.f41565p = i02;
                    if (i02 != null) {
                        e4.f41551b |= 8192;
                        break;
                    }
                    break;
                case IronSourceConstants.RETRY_LIMIT /* 62 */:
                    C3276g.C3291p j02 = j0(str2);
                    e4.f41566q = j02;
                    if (j02 != null) {
                        e4.f41551b |= 16384;
                        break;
                    }
                    break;
                case 63:
                    Integer l02 = l0(str2);
                    e4.f41567r = l02;
                    if (l02 != null) {
                        e4.f41551b |= 32768;
                        break;
                    }
                    break;
                case UserVerificationMethods.USER_VERIFY_EYEPRINT /* 64 */:
                    C3276g.E.b k02 = k0(str2);
                    e4.f41568s = k02;
                    if (k02 != null) {
                        e4.f41551b |= 65536;
                        break;
                    }
                    break;
                case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    C3276g.E.EnumC0238g H02 = H0(str2);
                    e4.f41569t = H02;
                    if (H02 != null) {
                        e4.f41551b |= 131072;
                        break;
                    }
                    break;
                case 66:
                    C3276g.E.h I02 = I0(str2);
                    e4.f41570u = I02;
                    if (I02 != null) {
                        e4.f41551b |= 68719476736L;
                        break;
                    }
                    break;
                case 67:
                    C3276g.E.f G02 = G0(str2);
                    e4.f41571v = G02;
                    if (G02 != null) {
                        e4.f41551b |= 262144;
                        break;
                    }
                    break;
                case 68:
                    Boolean s02 = s0(str2);
                    e4.f41572w = s02;
                    if (s02 != null) {
                        e4.f41551b |= 524288;
                        break;
                    }
                    break;
                case 69:
                    String m02 = m0(str2, str);
                    e4.f41574y = m02;
                    e4.f41575z = m02;
                    e4.f41537A = m02;
                    e4.f41551b |= 14680064;
                    break;
                case IronSourceConstants.TEST_SUITE_LAUNCH_TS /* 70 */:
                    e4.f41574y = m0(str2, str);
                    e4.f41551b |= 2097152;
                    break;
                case IronSourceConstants.TEST_SUITE_OPENED_SUCCESSFULLY /* 71 */:
                    e4.f41575z = m0(str2, str);
                    e4.f41551b |= 4194304;
                    break;
                case IronSourceConstants.TEST_SUITE_FAILED_TO_OPEN /* 72 */:
                    e4.f41537A = m0(str2, str);
                    e4.f41551b |= 8388608;
                    break;
                case IronSourceConstants.TEST_SUITE_WEB_CONTROLLER_OPEN_SUCCESSFULLY /* 73 */:
                    if (str2.indexOf(124) < 0) {
                        if ("|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".contains('|' + str2 + '|')) {
                            e4.f41538B = Boolean.valueOf(!str2.equals("none"));
                            e4.f41551b |= 16777216;
                            break;
                        }
                    }
                    break;
                case IronSourceConstants.TEST_SUITE_WEB_CONTROLLER_FAILED_TO_LOAD /* 74 */:
                    if (str2.indexOf(124) < 0) {
                        if ("|visible|hidden|collapse|".contains('|' + str2 + '|')) {
                            e4.f41539C = Boolean.valueOf(str2.equals("visible"));
                            e4.f41551b |= 33554432;
                            break;
                        }
                    }
                    break;
                case 75:
                    if (str2.equals("currentColor")) {
                        e4.f41540D = C3276g.C0239g.a();
                    } else {
                        try {
                            e4.f41540D = b0(str2);
                        } catch (C3304j e5) {
                            Log.w("SVGParser", e5.getMessage());
                            return;
                        }
                    }
                    e4.f41551b |= 67108864;
                    break;
                case 76:
                    e4.f41541E = r0(str2);
                    e4.f41551b |= 134217728;
                    break;
                case 77:
                    C3276g.C3279c a02 = a0(str2);
                    e4.f41573x = a02;
                    if (a02 != null) {
                        e4.f41551b |= 1048576;
                        break;
                    }
                    break;
                case 78:
                    e4.f41542F = m0(str2, str);
                    e4.f41551b |= 268435456;
                    break;
                case 79:
                    e4.f41543G = e0(str2);
                    e4.f41551b |= 536870912;
                    break;
                case 80:
                    e4.f41544H = m0(str2, str);
                    e4.f41551b |= 1073741824;
                    break;
                case IronSourceConstants.TROUBLESHOOTING_AD_QUALITY_SDK_INITIALIZED_SUCCESSFULLY_EVENT /* 81 */:
                    if (str2.equals("currentColor")) {
                        e4.f41545I = C3276g.C0239g.a();
                    } else {
                        try {
                            e4.f41545I = b0(str2);
                        } catch (C3304j e6) {
                            Log.w("SVGParser", e6.getMessage());
                            return;
                        }
                    }
                    e4.f41551b |= 2147483648L;
                    break;
                case IronSourceConstants.TROUBLESHOOTING_AD_QUALITY_SDK_WAS_ALREADY_INITIALIZED_EVENT /* 82 */:
                    e4.f41546J = r0(str2);
                    e4.f41551b |= 4294967296L;
                    break;
                case IronSourceConstants.TROUBLESHOOTING_AD_QUALITY_SDK_FAILED_TO_INITIALIZE_EVENT /* 83 */:
                    if (str2.equals("currentColor")) {
                        e4.f41547K = C3276g.C0239g.a();
                    } else {
                        try {
                            e4.f41547K = b0(str2);
                        } catch (C3304j e7) {
                            Log.w("SVGParser", e7.getMessage());
                            return;
                        }
                    }
                    e4.f41551b |= 8589934592L;
                    break;
                case IronSourceConstants.TROUBLESHOOTING_AD_QUALITY_SDK_NOT_EXIST /* 84 */:
                    e4.f41548L = r0(str2);
                    e4.f41551b |= 17179869184L;
                    break;
                case 85:
                    C3276g.E.i M02 = M0(str2);
                    e4.f41549M = M02;
                    if (M02 != null) {
                        e4.f41551b |= 34359738368L;
                        break;
                    }
                    break;
                case 86:
                    C3276g.E.e y02 = y0(str2);
                    e4.f41550N = y02;
                    if (y02 != null) {
                        e4.f41551b |= 137438953472L;
                        break;
                    }
                    break;
            }
        } catch (C3304j unused) {
        }
    }

    private void T(C3276g.U u4, Attributes attributes) {
        for (int i4 = 0; i4 < attributes.getLength(); i4++) {
            String trim = attributes.getValue(i4).trim();
            if (a.f41813b[g.a(attributes.getLocalName(i4)).ordinal()] == 6 && ("".equals(attributes.getURI(i4)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i4)))) {
                u4.f41646o = trim;
            }
        }
    }

    private void T0(Attributes attributes) {
        l("<radialGradient>", new Object[0]);
        if (this.f41804b == null) {
            throw new C3304j("Invalid document. Root element must be <svg>");
        }
        C3276g.Q q4 = new C3276g.Q();
        q4.f41637a = this.f41803a;
        q4.f41638b = this.f41804b;
        D(q4, attributes);
        S(q4, attributes);
        F(q4, attributes);
        O(q4, attributes);
        this.f41804b.h(q4);
        this.f41804b = q4;
    }

    private void U(C3276g.Z z4, Attributes attributes) {
        for (int i4 = 0; i4 < attributes.getLength(); i4++) {
            String trim = attributes.getValue(i4).trim();
            int i5 = a.f41813b[g.a(attributes.getLocalName(i4)).ordinal()];
            if (i5 != 6) {
                if (i5 == 39) {
                    z4.f41651p = o0(trim);
                }
            } else if ("".equals(attributes.getURI(i4)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i4))) {
                z4.f41650o = trim;
            }
        }
    }

    private void U0(Attributes attributes) {
        l("<rect>", new Object[0]);
        if (this.f41804b == null) {
            throw new C3304j("Invalid document. Root element must be <svg>");
        }
        C3276g.B b4 = new C3276g.B();
        b4.f41637a = this.f41803a;
        b4.f41638b = this.f41804b;
        D(b4, attributes);
        S(b4, attributes);
        W(b4, attributes);
        C(b4, attributes);
        P(b4, attributes);
        this.f41804b.h(b4);
    }

    private void V(C3276g.a0 a0Var, Attributes attributes) {
        for (int i4 = 0; i4 < attributes.getLength(); i4++) {
            String trim = attributes.getValue(i4).trim();
            int i5 = a.f41813b[g.a(attributes.getLocalName(i4)).ordinal()];
            if (i5 == 1) {
                a0Var.f41654o = p0(trim);
            } else if (i5 == 2) {
                a0Var.f41655p = p0(trim);
            } else if (i5 == 19) {
                a0Var.f41656q = p0(trim);
            } else if (i5 == 20) {
                a0Var.f41657r = p0(trim);
            }
        }
    }

    private void V0(Attributes attributes) {
        l("<solidColor>", new Object[0]);
        if (this.f41804b == null) {
            throw new C3304j("Invalid document. Root element must be <svg>");
        }
        C3276g.C c4 = new C3276g.C();
        c4.f41637a = this.f41803a;
        c4.f41638b = this.f41804b;
        D(c4, attributes);
        S(c4, attributes);
        this.f41804b.h(c4);
        this.f41804b = c4;
    }

    private void W(C3276g.InterfaceC3289n interfaceC3289n, Attributes attributes) {
        for (int i4 = 0; i4 < attributes.getLength(); i4++) {
            if (g.a(attributes.getLocalName(i4)) == g.transform) {
                interfaceC3289n.i(J0(attributes.getValue(i4)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W0() {
        this.f41803a = new C3276g();
    }

    private void X(C3276g.e0 e0Var, Attributes attributes) {
        for (int i4 = 0; i4 < attributes.getLength(); i4++) {
            String trim = attributes.getValue(i4).trim();
            int i5 = a.f41813b[g.a(attributes.getLocalName(i4)).ordinal()];
            if (i5 == 1) {
                e0Var.f41683q = o0(trim);
            } else if (i5 == 2) {
                e0Var.f41684r = o0(trim);
            } else if (i5 == 3) {
                C3276g.C3291p o02 = o0(trim);
                e0Var.f41685s = o02;
                if (o02.h()) {
                    throw new C3304j("Invalid <use> element. width cannot be negative");
                }
            } else if (i5 == 4) {
                C3276g.C3291p o03 = o0(trim);
                e0Var.f41686t = o03;
                if (o03.h()) {
                    throw new C3304j("Invalid <use> element. height cannot be negative");
                }
            } else if (i5 == 6 && ("".equals(attributes.getURI(i4)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i4)))) {
                e0Var.f41682p = trim;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X0(String str, String str2, String str3, Attributes attributes) {
        if (this.f41805c) {
            this.f41806d++;
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            h a4 = h.a(str2);
            switch (a.f41812a[a4.ordinal()]) {
                case 1:
                    a1(attributes);
                    break;
                case 2:
                case 3:
                    q(attributes);
                    break;
                case 4:
                    m(attributes);
                    break;
                case 5:
                    i1(attributes);
                    break;
                case 6:
                    O0(attributes);
                    break;
                case 7:
                    U0(attributes);
                    break;
                case 8:
                    i(attributes);
                    break;
                case 9:
                    n(attributes);
                    break;
                case 10:
                    v(attributes);
                    break;
                case 11:
                    R0(attributes);
                    break;
                case 12:
                    Q0(attributes);
                    break;
                case 13:
                    d1(attributes);
                    break;
                case 14:
                    h1(attributes);
                    break;
                case 15:
                    g1(attributes);
                    break;
                case 16:
                    k1(attributes);
                    break;
                case 17:
                    b1(attributes);
                    break;
                case 18:
                    x(attributes);
                    break;
                case 19:
                    w(attributes);
                    break;
                case 20:
                    T0(attributes);
                    break;
                case 21:
                    Y0(attributes);
                    break;
                case 22:
                case ConnectionResult.API_DISABLED /* 23 */:
                    this.f41807e = true;
                    this.f41808f = a4;
                    break;
                case 24:
                    k(attributes);
                    break;
                case 25:
                    f1(attributes);
                    break;
                case 26:
                    P0(attributes);
                    break;
                case 27:
                    u(attributes);
                    break;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    j1(attributes);
                    break;
                case 29:
                    y(attributes);
                    break;
                case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                    Z0(attributes);
                    break;
                case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                    V0(attributes);
                    break;
                default:
                    this.f41805c = true;
                    this.f41806d = 1;
                    break;
            }
        }
    }

    private void Y(C3276g.R r4, Attributes attributes) {
        for (int i4 = 0; i4 < attributes.getLength(); i4++) {
            String trim = attributes.getValue(i4).trim();
            int i5 = a.f41813b[g.a(attributes.getLocalName(i4)).ordinal()];
            if (i5 == 7) {
                w0(r4, trim);
            } else if (i5 == 87) {
                r4.f41645p = N0(trim);
            }
        }
    }

    private void Y0(Attributes attributes) {
        l("<stop>", new Object[0]);
        C3276g.J j4 = this.f41804b;
        if (j4 == null) {
            throw new C3304j("Invalid document. Root element must be <svg>");
        }
        if (!(j4 instanceof C3276g.AbstractC3285j)) {
            throw new C3304j("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.");
        }
        C3276g.D d4 = new C3276g.D();
        d4.f41637a = this.f41803a;
        d4.f41638b = this.f41804b;
        D(d4, attributes);
        S(d4, attributes);
        R(d4, attributes);
        this.f41804b.h(d4);
        this.f41804b = d4;
    }

    private void Z(String str) {
        this.f41803a.a(new C3271b(C3271b.f.screen, C3271b.u.Document).d(str));
    }

    private void Z0(Attributes attributes) {
        l("<style>", new Object[0]);
        if (this.f41804b == null) {
            throw new C3304j("Invalid document. Root element must be <svg>");
        }
        String str = "all";
        boolean z4 = true;
        for (int i4 = 0; i4 < attributes.getLength(); i4++) {
            String trim = attributes.getValue(i4).trim();
            int i5 = a.f41813b[g.a(attributes.getLocalName(i4)).ordinal()];
            if (i5 == 88) {
                z4 = trim.equals("text/css");
            } else if (i5 == 89) {
                str = trim;
            }
        }
        if (z4 && C3271b.b(str, C3271b.f.screen)) {
            this.f41810h = true;
        } else {
            this.f41805c = true;
            this.f41806d = 1;
        }
    }

    private static C3276g.C3279c a0(String str) {
        if ("auto".equals(str) || !str.startsWith("rect(")) {
            return null;
        }
        i iVar = new i(str.substring(5));
        iVar.A();
        C3276g.C3291p q02 = q0(iVar);
        iVar.z();
        C3276g.C3291p q03 = q0(iVar);
        iVar.z();
        C3276g.C3291p q04 = q0(iVar);
        iVar.z();
        C3276g.C3291p q05 = q0(iVar);
        iVar.A();
        if (iVar.f(')') || iVar.h()) {
            return new C3276g.C3279c(q02, q03, q04, q05);
        }
        return null;
    }

    private void a1(Attributes attributes) {
        l("<svg>", new Object[0]);
        C3276g.F f4 = new C3276g.F();
        f4.f41637a = this.f41803a;
        f4.f41638b = this.f41804b;
        D(f4, attributes);
        S(f4, attributes);
        C(f4, attributes);
        Y(f4, attributes);
        Q(f4, attributes);
        C3276g.J j4 = this.f41804b;
        if (j4 == null) {
            this.f41803a.u(f4);
        } else {
            j4.h(f4);
        }
        this.f41804b = f4;
    }

    private static C3276g.C3282f b0(String str) {
        if (str.charAt(0) == '#') {
            C3272c b4 = C3272c.b(str, 1, str.length());
            if (b4 == null) {
                throw new C3304j("Bad hex colour value: " + str);
            }
            int a4 = b4.a();
            if (a4 == 4) {
                int d4 = b4.d();
                int i4 = d4 & 3840;
                int i5 = d4 & 240;
                int i6 = d4 & 15;
                return new C3276g.C3282f(i6 | (i4 << 8) | (-16777216) | (i4 << 12) | (i5 << 8) | (i5 << 4) | (i6 << 4));
            }
            if (a4 == 5) {
                int d5 = b4.d();
                int i7 = 61440 & d5;
                int i8 = d5 & 3840;
                int i9 = d5 & 240;
                int i10 = d5 & 15;
                return new C3276g.C3282f((i10 << 24) | (i10 << 28) | (i7 << 8) | (i7 << 4) | (i8 << 4) | i8 | i9 | (i9 >> 4));
            }
            if (a4 == 7) {
                return new C3276g.C3282f(b4.d() | (-16777216));
            }
            if (a4 == 9) {
                return new C3276g.C3282f((b4.d() >>> 8) | (b4.d() << 24));
            }
            throw new C3304j("Bad hex colour value: " + str);
        }
        String lowerCase = str.toLowerCase(Locale.US);
        boolean startsWith = lowerCase.startsWith("rgba(");
        if (!startsWith && !lowerCase.startsWith("rgb(")) {
            boolean startsWith2 = lowerCase.startsWith("hsla(");
            if (!startsWith2 && !lowerCase.startsWith("hsl(")) {
                return c0(lowerCase);
            }
            i iVar = new i(str.substring(startsWith2 ? 5 : 4));
            iVar.A();
            float n4 = iVar.n();
            float d6 = iVar.d(n4);
            if (!Float.isNaN(d6)) {
                iVar.f('%');
            }
            float d7 = iVar.d(d6);
            if (!Float.isNaN(d7)) {
                iVar.f('%');
            }
            if (!startsWith2) {
                iVar.A();
                if (!Float.isNaN(d7) && iVar.f(')')) {
                    return new C3276g.C3282f(s(n4, d6, d7) | (-16777216));
                }
                throw new C3304j("Bad hsl() colour value: " + str);
            }
            float d8 = iVar.d(d7);
            iVar.A();
            if (!Float.isNaN(d8) && iVar.f(')')) {
                return new C3276g.C3282f((j(d8 * 256.0f) << 24) | s(n4, d6, d7));
            }
            throw new C3304j("Bad hsla() colour value: " + str);
        }
        i iVar2 = new i(str.substring(startsWith ? 5 : 4));
        iVar2.A();
        float n5 = iVar2.n();
        if (!Float.isNaN(n5) && iVar2.f('%')) {
            n5 = (n5 * 256.0f) / 100.0f;
        }
        float d9 = iVar2.d(n5);
        if (!Float.isNaN(d9) && iVar2.f('%')) {
            d9 = (d9 * 256.0f) / 100.0f;
        }
        float d10 = iVar2.d(d9);
        if (!Float.isNaN(d10) && iVar2.f('%')) {
            d10 = (d10 * 256.0f) / 100.0f;
        }
        if (!startsWith) {
            iVar2.A();
            if (!Float.isNaN(d10) && iVar2.f(')')) {
                return new C3276g.C3282f((j(n5) << 16) | (-16777216) | (j(d9) << 8) | j(d10));
            }
            throw new C3304j("Bad rgb() colour value: " + str);
        }
        float d11 = iVar2.d(d10);
        iVar2.A();
        if (!Float.isNaN(d11) && iVar2.f(')')) {
            return new C3276g.C3282f((j(d11 * 256.0f) << 24) | (j(n5) << 16) | (j(d9) << 8) | j(d10));
        }
        throw new C3304j("Bad rgba() colour value: " + str);
    }

    private void b1(Attributes attributes) {
        l("<symbol>", new Object[0]);
        if (this.f41804b == null) {
            throw new C3304j("Invalid document. Root element must be <svg>");
        }
        C3276g.R t4 = new C3276g.T();
        t4.f41637a = this.f41803a;
        t4.f41638b = this.f41804b;
        D(t4, attributes);
        S(t4, attributes);
        C(t4, attributes);
        Y(t4, attributes);
        this.f41804b.h(t4);
        this.f41804b = t4;
    }

    private static C3276g.C3282f c0(String str) {
        Integer a4 = c.a(str);
        if (a4 != null) {
            return new C3276g.C3282f(a4.intValue());
        }
        throw new C3304j("Invalid colour keyword: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c1(String str) {
        if (this.f41805c) {
            return;
        }
        if (this.f41807e) {
            if (this.f41809g == null) {
                this.f41809g = new StringBuilder(str.length());
            }
            this.f41809g.append(str);
        } else if (this.f41810h) {
            if (this.f41811i == null) {
                this.f41811i = new StringBuilder(str.length());
            }
            this.f41811i.append(str);
        } else if (this.f41804b instanceof C3276g.Y) {
            h(str);
        }
    }

    private static C3276g.O d0(String str) {
        str.getClass();
        if (str.equals("none")) {
            return C3276g.C3282f.f41688d;
        }
        if (str.equals("currentColor")) {
            return C3276g.C0239g.a();
        }
        try {
            return b0(str);
        } catch (C3304j unused) {
            return null;
        }
    }

    private void d1(Attributes attributes) {
        l("<text>", new Object[0]);
        if (this.f41804b == null) {
            throw new C3304j("Invalid document. Root element must be <svg>");
        }
        C3276g.W w4 = new C3276g.W();
        w4.f41637a = this.f41803a;
        w4.f41638b = this.f41804b;
        D(w4, attributes);
        S(w4, attributes);
        W(w4, attributes);
        C(w4, attributes);
        V(w4, attributes);
        this.f41804b.h(w4);
        this.f41804b = w4;
    }

    private static C3276g.E.a e0(String str) {
        if ("nonzero".equals(str)) {
            return C3276g.E.a.NonZero;
        }
        if ("evenodd".equals(str)) {
            return C3276g.E.a.EvenOdd;
        }
        return null;
    }

    private void e1(char[] cArr, int i4, int i5) {
        if (this.f41805c) {
            return;
        }
        if (this.f41807e) {
            if (this.f41809g == null) {
                this.f41809g = new StringBuilder(i5);
            }
            this.f41809g.append(cArr, i4, i5);
        } else if (this.f41810h) {
            if (this.f41811i == null) {
                this.f41811i = new StringBuilder(i5);
            }
            this.f41811i.append(cArr, i4, i5);
        } else if (this.f41804b instanceof C3276g.Y) {
            h(new String(cArr, i4, i5));
        }
    }

    private static float f0(String str) {
        int length = str.length();
        if (length != 0) {
            return g0(str, 0, length);
        }
        throw new C3304j("Invalid float value (empty string)");
    }

    private void f1(Attributes attributes) {
        l("<textPath>", new Object[0]);
        if (this.f41804b == null) {
            throw new C3304j("Invalid document. Root element must be <svg>");
        }
        C3276g.Z z4 = new C3276g.Z();
        z4.f41637a = this.f41803a;
        z4.f41638b = this.f41804b;
        D(z4, attributes);
        S(z4, attributes);
        C(z4, attributes);
        U(z4, attributes);
        this.f41804b.h(z4);
        this.f41804b = z4;
        C3276g.J j4 = z4.f41638b;
        if (j4 instanceof C3276g.b0) {
            z4.n((C3276g.b0) j4);
        } else {
            z4.n(((C3276g.X) j4).e());
        }
    }

    private static float g0(String str, int i4, int i5) {
        float b4 = new C3273d().b(str, i4, i5);
        if (!Float.isNaN(b4)) {
            return b4;
        }
        throw new C3304j("Invalid float value: " + str);
    }

    private void g1(Attributes attributes) {
        l("<tref>", new Object[0]);
        C3276g.J j4 = this.f41804b;
        if (j4 == null) {
            throw new C3304j("Invalid document. Root element must be <svg>");
        }
        if (!(j4 instanceof C3276g.Y)) {
            throw new C3304j("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
        }
        C3276g.U u4 = new C3276g.U();
        u4.f41637a = this.f41803a;
        u4.f41638b = this.f41804b;
        D(u4, attributes);
        S(u4, attributes);
        C(u4, attributes);
        T(u4, attributes);
        this.f41804b.h(u4);
        C3276g.J j5 = u4.f41638b;
        if (j5 instanceof C3276g.b0) {
            u4.n((C3276g.b0) j5);
        } else {
            u4.n(((C3276g.X) j5).e());
        }
    }

    private void h(String str) {
        C3276g.H h4 = (C3276g.H) this.f41804b;
        int size = h4.f41616i.size();
        C3276g.N n4 = size == 0 ? null : (C3276g.N) h4.f41616i.get(size - 1);
        if (!(n4 instanceof C3276g.c0)) {
            this.f41804b.h(new C3276g.c0(str));
            return;
        }
        StringBuilder sb = new StringBuilder();
        C3276g.c0 c0Var = (C3276g.c0) n4;
        sb.append(c0Var.f41666c);
        sb.append(str);
        c0Var.f41666c = sb.toString();
    }

    private static void h0(C3276g.E e4, String str) {
        String s4;
        if ("|caption|icon|menu|message-box|small-caption|status-bar|".contains('|' + str + '|')) {
            i iVar = new i(str);
            Integer num = null;
            C3276g.E.b bVar = null;
            String str2 = null;
            while (true) {
                s4 = iVar.s('/');
                iVar.A();
                if (s4 != null) {
                    if (num != null && bVar != null) {
                        break;
                    }
                    if (!s4.equals("normal") && (num != null || (num = e.a(s4)) == null)) {
                        if (bVar != null || (bVar = k0(s4)) == null) {
                            if (str2 != null || !s4.equals("small-caps")) {
                                break;
                            } else {
                                str2 = s4;
                            }
                        }
                    }
                } else {
                    return;
                }
            }
            C3276g.C3291p j02 = j0(s4);
            if (iVar.f('/')) {
                iVar.A();
                String r4 = iVar.r();
                if (r4 != null) {
                    try {
                        o0(r4);
                    } catch (C3304j unused) {
                        return;
                    }
                }
                iVar.A();
            }
            e4.f41565p = i0(iVar.y());
            e4.f41566q = j02;
            e4.f41567r = Integer.valueOf(num == null ? 400 : num.intValue());
            if (bVar == null) {
                bVar = C3276g.E.b.Normal;
            }
            e4.f41568s = bVar;
            e4.f41551b |= 122880;
        }
    }

    private void h1(Attributes attributes) {
        l("<tspan>", new Object[0]);
        C3276g.J j4 = this.f41804b;
        if (j4 == null) {
            throw new C3304j("Invalid document. Root element must be <svg>");
        }
        if (!(j4 instanceof C3276g.Y)) {
            throw new C3304j("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
        }
        C3276g.V v4 = new C3276g.V();
        v4.f41637a = this.f41803a;
        v4.f41638b = this.f41804b;
        D(v4, attributes);
        S(v4, attributes);
        C(v4, attributes);
        V(v4, attributes);
        this.f41804b.h(v4);
        this.f41804b = v4;
        C3276g.J j5 = v4.f41638b;
        if (j5 instanceof C3276g.b0) {
            v4.n((C3276g.b0) j5);
        } else {
            v4.n(((C3276g.X) j5).e());
        }
    }

    private void i(Attributes attributes) {
        l("<circle>", new Object[0]);
        if (this.f41804b == null) {
            throw new C3304j("Invalid document. Root element must be <svg>");
        }
        C3276g.C3280d c3280d = new C3276g.C3280d();
        c3280d.f41637a = this.f41803a;
        c3280d.f41638b = this.f41804b;
        D(c3280d, attributes);
        S(c3280d, attributes);
        W(c3280d, attributes);
        C(c3280d, attributes);
        A(c3280d, attributes);
        this.f41804b.h(c3280d);
    }

    private static List i0(String str) {
        i iVar = new i(str);
        ArrayList arrayList = null;
        do {
            String q4 = iVar.q();
            if (q4 == null) {
                q4 = iVar.u(',');
            }
            if (q4 == null) {
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(q4);
            iVar.z();
        } while (!iVar.h());
        return arrayList;
    }

    private void i1(Attributes attributes) {
        l("<use>", new Object[0]);
        if (this.f41804b == null) {
            throw new C3304j("Invalid document. Root element must be <svg>");
        }
        C3276g.e0 e0Var = new C3276g.e0();
        e0Var.f41637a = this.f41803a;
        e0Var.f41638b = this.f41804b;
        D(e0Var, attributes);
        S(e0Var, attributes);
        W(e0Var, attributes);
        C(e0Var, attributes);
        X(e0Var, attributes);
        this.f41804b.h(e0Var);
        this.f41804b = e0Var;
    }

    private static int j(float f4) {
        if (f4 < 0.0f) {
            return 0;
        }
        return f4 > 255.0f ? KotlinVersion.MAX_COMPONENT_VALUE : Math.round(f4);
    }

    private static C3276g.C3291p j0(String str) {
        try {
            C3276g.C3291p a4 = d.a(str);
            return a4 == null ? o0(str) : a4;
        } catch (C3304j unused) {
            return null;
        }
    }

    private void j1(Attributes attributes) {
        l("<view>", new Object[0]);
        if (this.f41804b == null) {
            throw new C3304j("Invalid document. Root element must be <svg>");
        }
        C3276g.R f0Var = new C3276g.f0();
        f0Var.f41637a = this.f41803a;
        f0Var.f41638b = this.f41804b;
        D(f0Var, attributes);
        C(f0Var, attributes);
        Y(f0Var, attributes);
        this.f41804b.h(f0Var);
        this.f41804b = f0Var;
    }

    private void k(Attributes attributes) {
        l("<clipPath>", new Object[0]);
        if (this.f41804b == null) {
            throw new C3304j("Invalid document. Root element must be <svg>");
        }
        C3276g.C3281e c3281e = new C3276g.C3281e();
        c3281e.f41637a = this.f41803a;
        c3281e.f41638b = this.f41804b;
        D(c3281e, attributes);
        S(c3281e, attributes);
        W(c3281e, attributes);
        C(c3281e, attributes);
        B(c3281e, attributes);
        this.f41804b.h(c3281e);
        this.f41804b = c3281e;
    }

    private static C3276g.E.b k0(String str) {
        str.getClass();
        switch (str) {
            case "oblique":
                return C3276g.E.b.Oblique;
            case "italic":
                return C3276g.E.b.Italic;
            case "normal":
                return C3276g.E.b.Normal;
            default:
                return null;
        }
    }

    private void k1(Attributes attributes) {
        l("<switch>", new Object[0]);
        if (this.f41804b == null) {
            throw new C3304j("Invalid document. Root element must be <svg>");
        }
        C3276g.S s4 = new C3276g.S();
        s4.f41637a = this.f41803a;
        s4.f41638b = this.f41804b;
        D(s4, attributes);
        S(s4, attributes);
        W(s4, attributes);
        C(s4, attributes);
        this.f41804b.h(s4);
        this.f41804b = s4;
    }

    private static Integer l0(String str) {
        return e.a(str);
    }

    private void m(Attributes attributes) {
        l("<defs>", new Object[0]);
        if (this.f41804b == null) {
            throw new C3304j("Invalid document. Root element must be <svg>");
        }
        C3276g.C3283h c3283h = new C3276g.C3283h();
        c3283h.f41637a = this.f41803a;
        c3283h.f41638b = this.f41804b;
        D(c3283h, attributes);
        S(c3283h, attributes);
        W(c3283h, attributes);
        this.f41804b.h(c3283h);
        this.f41804b = c3283h;
    }

    private static String m0(String str, String str2) {
        if (!str.equals("none") && str.startsWith("url(")) {
            return str.endsWith(")") ? str.substring(4, str.length() - 1).trim() : str.substring(4).trim();
        }
        return null;
    }

    private void n(Attributes attributes) {
        l("<ellipse>", new Object[0]);
        if (this.f41804b == null) {
            throw new C3304j("Invalid document. Root element must be <svg>");
        }
        C3276g.C3284i c3284i = new C3276g.C3284i();
        c3284i.f41637a = this.f41803a;
        c3284i.f41638b = this.f41804b;
        D(c3284i, attributes);
        S(c3284i, attributes);
        W(c3284i, attributes);
        C(c3284i, attributes);
        E(c3284i, attributes);
        this.f41804b.h(c3284i);
    }

    private Float n0(String str) {
        if (str.length() == 0) {
            throw new C3304j("Invalid offset value in <stop> (empty string)");
        }
        int length = str.length();
        boolean z4 = true;
        if (str.charAt(str.length() - 1) == '%') {
            length--;
        } else {
            z4 = false;
        }
        try {
            float g02 = g0(str, 0, length);
            float f4 = 100.0f;
            if (z4) {
                g02 /= 100.0f;
            }
            if (g02 < 0.0f) {
                f4 = 0.0f;
            } else if (g02 <= 100.0f) {
                f4 = g02;
            }
            return Float.valueOf(f4);
        } catch (NumberFormatException e4) {
            throw new C3304j("Invalid offset value in <stop>: " + str, e4);
        }
    }

    static C3276g.C3291p o0(String str) {
        if (str.length() == 0) {
            throw new C3304j("Invalid length value (empty string)");
        }
        int length = str.length();
        C3276g.d0 d0Var = C3276g.d0.px;
        char charAt = str.charAt(length - 1);
        if (charAt == '%') {
            length--;
            d0Var = C3276g.d0.percent;
        } else if (length > 2 && Character.isLetter(charAt) && Character.isLetter(str.charAt(length - 2))) {
            length -= 2;
            try {
                d0Var = C3276g.d0.valueOf(str.substring(length).toLowerCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                throw new C3304j("Invalid length unit specifier: " + str);
            }
        }
        try {
            return new C3276g.C3291p(g0(str, 0, length), d0Var);
        } catch (NumberFormatException e4) {
            throw new C3304j("Invalid length value: " + str, e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(String str, String str2, String str3) {
        if (this.f41805c) {
            int i4 = this.f41806d - 1;
            this.f41806d = i4;
            if (i4 == 0) {
                this.f41805c = false;
                return;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            int i5 = a.f41812a[h.a(str2).ordinal()];
            if (i5 != 1 && i5 != 2 && i5 != 4 && i5 != 5 && i5 != 13 && i5 != 14) {
                switch (i5) {
                    case 22:
                    case ConnectionResult.API_DISABLED /* 23 */:
                        this.f41807e = false;
                        StringBuilder sb = this.f41809g;
                        if (sb != null) {
                            h hVar = this.f41808f;
                            if (hVar == h.title) {
                                this.f41803a.v(sb.toString());
                            } else if (hVar == h.desc) {
                                this.f41803a.s(sb.toString());
                            }
                            this.f41809g.setLength(0);
                            break;
                        }
                        break;
                    case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                        StringBuilder sb2 = this.f41811i;
                        if (sb2 != null) {
                            this.f41810h = false;
                            Z(sb2.toString());
                            this.f41811i.setLength(0);
                            break;
                        }
                        break;
                }
                return;
            }
            this.f41804b = ((C3276g.N) this.f41804b).f41638b;
        }
    }

    private static List p0(String str) {
        if (str.length() == 0) {
            throw new C3304j("Invalid length list (empty string)");
        }
        ArrayList arrayList = new ArrayList(1);
        i iVar = new i(str);
        iVar.A();
        while (!iVar.h()) {
            float n4 = iVar.n();
            if (Float.isNaN(n4)) {
                throw new C3304j("Invalid length list value: " + iVar.b());
            }
            C3276g.d0 v4 = iVar.v();
            if (v4 == null) {
                v4 = C3276g.d0.px;
            }
            arrayList.add(new C3276g.C3291p(n4, v4));
            iVar.z();
        }
        return arrayList;
    }

    private void q(Attributes attributes) {
        l("<g>", new Object[0]);
        if (this.f41804b == null) {
            throw new C3304j("Invalid document. Root element must be <svg>");
        }
        C3276g.C3288m c3288m = new C3276g.C3288m();
        c3288m.f41637a = this.f41803a;
        c3288m.f41638b = this.f41804b;
        D(c3288m, attributes);
        S(c3288m, attributes);
        W(c3288m, attributes);
        C(c3288m, attributes);
        this.f41804b.h(c3288m);
        this.f41804b = c3288m;
    }

    private static C3276g.C3291p q0(i iVar) {
        return iVar.g("auto") ? new C3276g.C3291p(0.0f) : iVar.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(String str, Map map) {
        if (str.equals("xml-stylesheet")) {
            C3276g.k();
        }
    }

    private static Float r0(String str) {
        try {
            float f02 = f0(str);
            float f4 = 0.0f;
            if (f02 >= 0.0f) {
                f4 = 1.0f;
                if (f02 > 1.0f) {
                }
                return Float.valueOf(f02);
            }
            f02 = f4;
            return Float.valueOf(f02);
        } catch (C3304j unused) {
            return null;
        }
    }

    private static int s(float f4, float f5, float f6) {
        float f7 = f4 % 360.0f;
        if (f4 < 0.0f) {
            f7 += 360.0f;
        }
        float f8 = f7 / 60.0f;
        float f9 = f5 / 100.0f;
        float f10 = f6 / 100.0f;
        if (f9 < 0.0f) {
            f9 = 0.0f;
        } else if (f9 > 1.0f) {
            f9 = 1.0f;
        }
        float f11 = f10 >= 0.0f ? f10 > 1.0f ? 1.0f : f10 : 0.0f;
        float f12 = f11 <= 0.5f ? (f9 + 1.0f) * f11 : (f11 + f9) - (f9 * f11);
        float f13 = (f11 * 2.0f) - f12;
        return j(t(f13, f12, f8 - 2.0f) * 256.0f) | (j(t(f13, f12, f8 + 2.0f) * 256.0f) << 16) | (j(t(f13, f12, f8) * 256.0f) << 8);
    }

    private static Boolean s0(String str) {
        str.getClass();
        switch (str) {
            case "hidden":
            case "scroll":
                return Boolean.FALSE;
            case "auto":
            case "visible":
                return Boolean.TRUE;
            default:
                return null;
        }
    }

    private static float t(float f4, float f5, float f6) {
        float f7;
        if (f6 < 0.0f) {
            f6 += 6.0f;
        }
        if (f6 >= 6.0f) {
            f6 -= 6.0f;
        }
        if (f6 < 1.0f) {
            f7 = (f5 - f4) * f6;
        } else {
            if (f6 < 3.0f) {
                return f5;
            }
            if (f6 >= 4.0f) {
                return f4;
            }
            f7 = (f5 - f4) * (4.0f - f6);
        }
        return f7 + f4;
    }

    private static C3276g.O t0(String str) {
        if (!str.startsWith("url(")) {
            return d0(str);
        }
        int indexOf = str.indexOf(")");
        if (indexOf == -1) {
            return new C3276g.C3296u(str.substring(4).trim(), null);
        }
        String trim = str.substring(4, indexOf).trim();
        String trim2 = str.substring(indexOf + 1).trim();
        return new C3276g.C3296u(trim, trim2.length() > 0 ? d0(trim2) : null);
    }

    private void u(Attributes attributes) {
        l("<image>", new Object[0]);
        if (this.f41804b == null) {
            throw new C3304j("Invalid document. Root element must be <svg>");
        }
        C3276g.C3290o c3290o = new C3276g.C3290o();
        c3290o.f41637a = this.f41803a;
        c3290o.f41638b = this.f41804b;
        D(c3290o, attributes);
        S(c3290o, attributes);
        W(c3290o, attributes);
        C(c3290o, attributes);
        G(c3290o, attributes);
        this.f41804b.h(c3290o);
        this.f41804b = c3290o;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0280 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static C3276g.C3298w u0(String str) {
        float f4;
        float f5;
        float f6;
        i iVar = new i(str);
        C3276g.C3298w c3298w = new C3276g.C3298w();
        if (!iVar.h()) {
            int intValue = iVar.l().intValue();
            int i4 = InterfaceC1490j3.d.b.f16815g;
            if (intValue == 77 || intValue == 109) {
                int i5 = intValue;
                float f7 = 0.0f;
                float f8 = 0.0f;
                float f9 = 0.0f;
                float f10 = 0.0f;
                float f11 = 0.0f;
                float f12 = 0.0f;
                while (true) {
                    iVar.A();
                    switch (i5) {
                        case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                        case 97:
                            float f13 = f7;
                            float n4 = iVar.n();
                            float d4 = iVar.d(n4);
                            float f14 = f9;
                            float d5 = iVar.d(d4);
                            Boolean c4 = iVar.c(Float.valueOf(d5));
                            Boolean c5 = iVar.c(c4);
                            float e4 = iVar.e(c5);
                            float d6 = iVar.d(e4);
                            if (!Float.isNaN(d6) && n4 >= 0.0f && d4 >= 0.0f) {
                                if (i5 == 97) {
                                    e4 += f13;
                                    d6 += f14;
                                }
                                float f15 = d6;
                                boolean booleanValue = c4.booleanValue();
                                boolean booleanValue2 = c5.booleanValue();
                                float f16 = e4;
                                c3298w.d(n4, d4, d5, booleanValue, booleanValue2, f16, f15);
                                f7 = f16;
                                f8 = f7;
                                f9 = f15;
                                f10 = f9;
                                iVar.z();
                                if (!iVar.h()) {
                                    break;
                                } else {
                                    if (iVar.i()) {
                                        i5 = iVar.l().intValue();
                                    }
                                    i4 = InterfaceC1490j3.d.b.f16815g;
                                }
                            }
                            break;
                        case 67:
                        case 99:
                            float n5 = iVar.n();
                            float d7 = iVar.d(n5);
                            float d8 = iVar.d(d7);
                            float d9 = iVar.d(d8);
                            float d10 = iVar.d(d9);
                            float d11 = iVar.d(d10);
                            if (Float.isNaN(d11)) {
                                Log.e("SVGParser", "Bad path coords for " + ((char) i5) + " path segment");
                                break;
                            } else {
                                if (i5 == 99) {
                                    d10 += f7;
                                    d11 += f9;
                                    n5 += f7;
                                    d7 += f9;
                                    d8 += f7;
                                    d9 += f9;
                                }
                                float f17 = n5;
                                float f18 = d7;
                                f4 = d8;
                                f10 = d9;
                                f5 = d10;
                                f6 = d11;
                                c3298w.c(f17, f18, f4, f10, f5, f6);
                                f8 = f4;
                                f7 = f5;
                                f9 = f6;
                                iVar.z();
                                if (!iVar.h()) {
                                }
                            }
                            break;
                        case IronSourceConstants.TEST_SUITE_FAILED_TO_OPEN /* 72 */:
                        case 104:
                            float n6 = iVar.n();
                            if (Float.isNaN(n6)) {
                                Log.e("SVGParser", "Bad path coords for " + ((char) i5) + " path segment");
                                break;
                            } else {
                                if (i5 == 104) {
                                    n6 += f7;
                                }
                                f7 = n6;
                                c3298w.e(f7, f9);
                                f8 = f7;
                                iVar.z();
                                if (!iVar.h()) {
                                }
                            }
                            break;
                        case 76:
                        case 108:
                            float n7 = iVar.n();
                            float d12 = iVar.d(n7);
                            if (Float.isNaN(d12)) {
                                Log.e("SVGParser", "Bad path coords for " + ((char) i5) + " path segment");
                                break;
                            } else {
                                if (i5 == 108) {
                                    n7 += f7;
                                    d12 += f9;
                                }
                                f7 = n7;
                                f9 = d12;
                                c3298w.e(f7, f9);
                                f8 = f7;
                                f10 = f9;
                                iVar.z();
                                if (!iVar.h()) {
                                }
                            }
                            break;
                        case 77:
                        case InterfaceC1490j3.d.b.f16815g /* 109 */:
                            float n8 = iVar.n();
                            float d13 = iVar.d(n8);
                            if (Float.isNaN(d13)) {
                                Log.e("SVGParser", "Bad path coords for " + ((char) i5) + " path segment");
                                break;
                            } else {
                                if (i5 == i4 && !c3298w.i()) {
                                    n8 += f7;
                                    d13 += f9;
                                }
                                f7 = n8;
                                f9 = d13;
                                c3298w.b(f7, f9);
                                f8 = f7;
                                f11 = f8;
                                f10 = f9;
                                f12 = f10;
                                i5 = i5 != i4 ? 76 : 108;
                                iVar.z();
                                if (!iVar.h()) {
                                }
                            }
                            break;
                        case IronSourceConstants.TROUBLESHOOTING_AD_QUALITY_SDK_INITIALIZED_SUCCESSFULLY_EVENT /* 81 */:
                        case 113:
                            f8 = iVar.n();
                            f10 = iVar.d(f8);
                            float d14 = iVar.d(f10);
                            float d15 = iVar.d(d14);
                            if (Float.isNaN(d15)) {
                                Log.e("SVGParser", "Bad path coords for " + ((char) i5) + " path segment");
                                break;
                            } else {
                                if (i5 == 113) {
                                    d14 += f7;
                                    d15 += f9;
                                    f8 += f7;
                                    f10 += f9;
                                }
                                f7 = d14;
                                f9 = d15;
                                c3298w.a(f8, f10, f7, f9);
                                iVar.z();
                                if (!iVar.h()) {
                                }
                            }
                            break;
                        case IronSourceConstants.TROUBLESHOOTING_AD_QUALITY_SDK_FAILED_TO_INITIALIZE_EVENT /* 83 */:
                        case BuildConfig.API_LEVEL /* 115 */:
                            float f19 = (f7 * 2.0f) - f8;
                            float f20 = (2.0f * f9) - f10;
                            float n9 = iVar.n();
                            float d16 = iVar.d(n9);
                            float d17 = iVar.d(d16);
                            float d18 = iVar.d(d17);
                            if (Float.isNaN(d18)) {
                                Log.e("SVGParser", "Bad path coords for " + ((char) i5) + " path segment");
                                break;
                            } else {
                                if (i5 == 115) {
                                    d17 += f7;
                                    d18 += f9;
                                    n9 += f7;
                                    d16 += f9;
                                }
                                f4 = n9;
                                f10 = d16;
                                f5 = d17;
                                f6 = d18;
                                c3298w.c(f19, f20, f4, f10, f5, f6);
                                f8 = f4;
                                f7 = f5;
                                f9 = f6;
                                iVar.z();
                                if (!iVar.h()) {
                                }
                            }
                            break;
                        case IronSourceConstants.TROUBLESHOOTING_AD_QUALITY_SDK_NOT_EXIST /* 84 */:
                        case 116:
                            f8 = (f7 * 2.0f) - f8;
                            f10 = (2.0f * f9) - f10;
                            float n10 = iVar.n();
                            float d19 = iVar.d(n10);
                            if (Float.isNaN(d19)) {
                                Log.e("SVGParser", "Bad path coords for " + ((char) i5) + " path segment");
                                break;
                            } else {
                                if (i5 == 116) {
                                    n10 += f7;
                                    d19 += f9;
                                }
                                f7 = n10;
                                f9 = d19;
                                c3298w.a(f8, f10, f7, f9);
                                iVar.z();
                                if (!iVar.h()) {
                                }
                            }
                            break;
                        case 86:
                        case 118:
                            float n11 = iVar.n();
                            if (Float.isNaN(n11)) {
                                Log.e("SVGParser", "Bad path coords for " + ((char) i5) + " path segment");
                                break;
                            } else {
                                if (i5 == 118) {
                                    n11 += f9;
                                }
                                f9 = n11;
                                c3298w.e(f7, f9);
                                f10 = f9;
                                iVar.z();
                                if (!iVar.h()) {
                                }
                            }
                            break;
                        case AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS /* 90 */:
                        case 122:
                            c3298w.close();
                            f7 = f11;
                            f8 = f7;
                            f9 = f12;
                            f10 = f9;
                            iVar.z();
                            if (!iVar.h()) {
                            }
                            break;
                    }
                    return c3298w;
                }
            }
        }
        return c3298w;
    }

    private void v(Attributes attributes) {
        l("<line>", new Object[0]);
        if (this.f41804b == null) {
            throw new C3304j("Invalid document. Root element must be <svg>");
        }
        C3276g.C3292q c3292q = new C3276g.C3292q();
        c3292q.f41637a = this.f41803a;
        c3292q.f41638b = this.f41804b;
        D(c3292q, attributes);
        S(c3292q, attributes);
        W(c3292q, attributes);
        C(c3292q, attributes);
        H(c3292q, attributes);
        this.f41804b.h(c3292q);
    }

    static C3274e v0(String str) {
        C3274e.b bVar;
        i iVar = new i(str);
        iVar.A();
        String r4 = iVar.r();
        if ("defer".equals(r4)) {
            iVar.A();
            r4 = iVar.r();
        }
        C3274e.a a4 = b.a(r4);
        iVar.A();
        if (iVar.h()) {
            bVar = null;
        } else {
            String r5 = iVar.r();
            r5.getClass();
            if (r5.equals("meet")) {
                bVar = C3274e.b.meet;
            } else {
                if (!r5.equals("slice")) {
                    throw new C3304j("Invalid preserveAspectRatio definition: " + str);
                }
                bVar = C3274e.b.slice;
            }
        }
        return new C3274e(a4, bVar);
    }

    private void w(Attributes attributes) {
        l("<linearGradient>", new Object[0]);
        if (this.f41804b == null) {
            throw new C3304j("Invalid document. Root element must be <svg>");
        }
        C3276g.M m4 = new C3276g.M();
        m4.f41637a = this.f41803a;
        m4.f41638b = this.f41804b;
        D(m4, attributes);
        S(m4, attributes);
        F(m4, attributes);
        I(m4, attributes);
        this.f41804b.h(m4);
        this.f41804b = m4;
    }

    private static void w0(C3276g.P p4, String str) {
        p4.f41639o = v0(str);
    }

    private void x(Attributes attributes) {
        l("<marker>", new Object[0]);
        if (this.f41804b == null) {
            throw new C3304j("Invalid document. Root element must be <svg>");
        }
        C3276g.C3293r c3293r = new C3276g.C3293r();
        c3293r.f41637a = this.f41803a;
        c3293r.f41638b = this.f41804b;
        D(c3293r, attributes);
        S(c3293r, attributes);
        C(c3293r, attributes);
        Y(c3293r, attributes);
        J(c3293r, attributes);
        this.f41804b.h(c3293r);
        this.f41804b = c3293r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map x0(i iVar) {
        HashMap hashMap = new HashMap();
        iVar.A();
        String s4 = iVar.s(cc.f15727T);
        while (s4 != null) {
            iVar.f(cc.f15727T);
            hashMap.put(s4, iVar.q());
            iVar.A();
            s4 = iVar.s(cc.f15727T);
        }
        return hashMap;
    }

    private void y(Attributes attributes) {
        l("<mask>", new Object[0]);
        if (this.f41804b == null) {
            throw new C3304j("Invalid document. Root element must be <svg>");
        }
        C3276g.C3294s c3294s = new C3276g.C3294s();
        c3294s.f41637a = this.f41803a;
        c3294s.f41638b = this.f41804b;
        D(c3294s, attributes);
        S(c3294s, attributes);
        C(c3294s, attributes);
        K(c3294s, attributes);
        this.f41804b.h(c3294s);
        this.f41804b = c3294s;
    }

    private static C3276g.E.e y0(String str) {
        str.getClass();
        switch (str) {
            case "optimizeQuality":
                return C3276g.E.e.optimizeQuality;
            case "auto":
                return C3276g.E.e.auto;
            case "optimizeSpeed":
                return C3276g.E.e.optimizeSpeed;
            default:
                return null;
        }
    }

    private static Set z0(String str) {
        i iVar = new i(str);
        HashSet hashSet = new HashSet();
        while (!iVar.h()) {
            String r4 = iVar.r();
            if (r4.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                hashSet.add(r4.substring(35));
            } else {
                hashSet.add("UNSUPPORTED");
            }
            iVar.A();
        }
        return hashSet;
    }

    C3276g z(InputStream inputStream, boolean z4) {
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        try {
            inputStream.mark(3);
            int read = inputStream.read() + (inputStream.read() << 8);
            inputStream.reset();
            if (read == 35615) {
                inputStream = new BufferedInputStream(new GZIPInputStream(inputStream));
            }
        } catch (IOException unused) {
        }
        try {
            inputStream.mark(Base64Utils.IO_BUFFER_SIZE);
            L0(inputStream, z4);
            return this.f41803a;
        } finally {
            try {
                inputStream.close();
            } catch (IOException unused2) {
                Log.e("SVGParser", "Exception thrown closing input stream");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
    }

    private void l(String str, Object... objArr) {
    }
}
