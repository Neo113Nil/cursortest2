package defpackage;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class fo2 extends l03 {
    public static final ji c = new ji(3);
    public static final ji d = new ji(4);
    public static final ji e = new ji(1);
    public final /* synthetic */ int a;
    public final Object b;

    public fo2(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new SimpleDateFormat("hh:mm:ss a");
                break;
            case 2:
                ArrayList arrayList = new ArrayList();
                this.b = arrayList;
                Locale locale = Locale.US;
                arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
                if (!Locale.getDefault().equals(locale)) {
                    arrayList.add(DateFormat.getDateTimeInstance(2, 2));
                }
                if (n51.a >= 9) {
                    arrayList.add(yk3.G(2, 2));
                    break;
                }
                break;
            default:
                this.b = new SimpleDateFormat("MMM d, yyyy");
                break;
        }
    }

    @Override // defpackage.l03
    public final Object a(z61 z61Var) {
        Date b;
        Time time = null;
        switch (this.a) {
            case 0:
                synchronized (this) {
                    if (z61Var.R() == 9) {
                        z61Var.N();
                        return null;
                    }
                    try {
                        return new java.sql.Date(((SimpleDateFormat) this.b).parse(z61Var.P()).getTime());
                    } catch (ParseException e2) {
                        throw new a71(e2);
                    }
                }
            case 1:
                synchronized (this) {
                    if (z61Var.R() == 9) {
                        z61Var.N();
                    } else {
                        try {
                            time = new Time(((SimpleDateFormat) this.b).parse(z61Var.P()).getTime());
                        } catch (ParseException e3) {
                            throw new a71(e3);
                        }
                    }
                }
                return time;
            default:
                if (z61Var.R() == 9) {
                    z61Var.N();
                    return null;
                }
                String P = z61Var.P();
                synchronized (this) {
                    ArrayList arrayList = (ArrayList) this.b;
                    int size = arrayList.size();
                    int i = 0;
                    while (true) {
                        if (i < size) {
                            Object obj = arrayList.get(i);
                            i++;
                            try {
                                b = ((DateFormat) obj).parse(P);
                            } catch (ParseException unused) {
                            }
                        } else {
                            try {
                                b = e01.b(P, new ParsePosition(0));
                            } catch (ParseException e4) {
                                throw new a71(P, e4);
                            }
                        }
                    }
                }
                return b;
        }
    }
}
