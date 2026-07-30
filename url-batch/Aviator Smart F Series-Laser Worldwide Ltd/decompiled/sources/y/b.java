package y;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f17327a = System.getProperty("line.separator");

    public static String a(Throwable th) {
        List list;
        ArrayList arrayList = new ArrayList();
        while (th != null && !arrayList.contains(th)) {
            arrayList.add(th);
            th = th.getCause();
        }
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        int i8 = size - 1;
        List b8 = b((Throwable) arrayList.get(i8));
        while (true) {
            int i9 = size - 1;
            if (i9 < 0) {
                break;
            }
            if (i9 != 0) {
                list = b((Throwable) arrayList.get(size - 2));
                a(b8, list);
            } else {
                list = b8;
            }
            if (i9 == i8) {
                arrayList2.add(((Throwable) arrayList.get(i9)).toString());
            } else {
                arrayList2.add(" Caused by: " + ((Throwable) arrayList.get(i9)).toString());
            }
            arrayList2.addAll(b8);
            b8 = list;
            size = i9;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append(f17327a);
        }
        return sb.toString();
    }

    public static List b(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter((Writer) stringWriter, true));
        StringTokenizer stringTokenizer = new StringTokenizer(stringWriter.toString(), f17327a);
        ArrayList arrayList = new ArrayList();
        boolean z7 = false;
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            int indexOf = nextToken.indexOf("at");
            if (indexOf != -1 && nextToken.substring(0, indexOf).trim().isEmpty()) {
                arrayList.add(nextToken);
                z7 = true;
            } else if (z7) {
                break;
            }
        }
        return arrayList;
    }

    public static void a(List list, List list2) {
        int size = list.size() - 1;
        for (int size2 = list2.size() - 1; size >= 0 && size2 >= 0; size2--) {
            if (((String) list.get(size)).equals((String) list2.get(size2))) {
                list.remove(size);
            }
            size--;
        }
    }
}
