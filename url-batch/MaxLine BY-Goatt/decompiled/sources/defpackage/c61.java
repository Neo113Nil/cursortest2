package defpackage;

import com.majelw.libystne.R;
import j$.time.format.DateTimeFormatter;
import java.text.DecimalFormat;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class c61 {
    public static final DecimalFormat a = new DecimalFormat("#,##0.##");
    public static final DateTimeFormatter b = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    public static final String a(Double d) {
        if (d == null || Intrinsics.a(d)) {
            return "—";
        }
        String format = a.format(d.doubleValue());
        format.getClass();
        return format;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final String b(String str, a00 a00Var) {
        int i;
        str.getClass();
        List list = b61.a;
        switch (str.hashCode()) {
            case -2041761456:
                if (str.equals("rose_gold")) {
                    i = R.string.jmetal_rose_gold;
                    break;
                }
                i = R.string.jmetal_other;
                break;
            case -902311155:
                if (str.equals("silver")) {
                    i = R.string.jmetal_silver;
                    break;
                }
                i = R.string.jmetal_other;
                break;
            case 3178592:
                if (str.equals("gold")) {
                    i = R.string.jmetal_gold;
                    break;
                }
                i = R.string.jmetal_other;
                break;
            case 109760971:
                if (str.equals("steel")) {
                    i = R.string.jmetal_steel;
                    break;
                }
                i = R.string.jmetal_other;
                break;
            case 258186934:
                if (str.equals("white_gold")) {
                    i = R.string.jmetal_white_gold;
                    break;
                }
                i = R.string.jmetal_other;
                break;
            case 1228204333:
                if (str.equals("palladium")) {
                    i = R.string.jmetal_palladium;
                    break;
                }
                i = R.string.jmetal_other;
                break;
            case 1874772524:
                if (str.equals("platinum")) {
                    i = R.string.jmetal_platinum;
                    break;
                }
                i = R.string.jmetal_other;
                break;
            default:
                i = R.string.jmetal_other;
                break;
        }
        return uj2.f(i, a00Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final String c(String str, a00 a00Var) {
        int i;
        str.getClass();
        List list = b61.a;
        switch (str.hashCode()) {
            case -1380612459:
                if (str.equals("brooch")) {
                    i = R.string.jtype_brooch;
                    break;
                }
                i = R.string.jtype_other;
                break;
            case -804029779:
                if (str.equals("earrings")) {
                    i = R.string.jtype_earrings;
                    break;
                }
                i = R.string.jtype_other;
                break;
            case -682595428:
                if (str.equals("pendant")) {
                    i = R.string.jtype_pendant;
                    break;
                }
                i = R.string.jtype_other;
                break;
            case -35502328:
                if (str.equals("bracelet")) {
                    i = R.string.jtype_bracelet;
                    break;
                }
                i = R.string.jtype_other;
                break;
            case 3500592:
                if (str.equals("ring")) {
                    i = R.string.jtype_ring;
                    break;
                }
                i = R.string.jtype_other;
                break;
            case 815583606:
                if (str.equals("necklace")) {
                    i = R.string.jtype_necklace;
                    break;
                }
                i = R.string.jtype_other;
                break;
            default:
                i = R.string.jtype_other;
                break;
        }
        return uj2.f(i, a00Var);
    }
}
