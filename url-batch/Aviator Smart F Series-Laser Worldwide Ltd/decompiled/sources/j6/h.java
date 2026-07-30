package j6;

/* loaded from: classes4.dex */
public interface h {

    public static final class a {
        public static <T extends Comparable<? super T>> boolean contains(h hVar, T value) {
            kotlin.jvm.internal.s.checkNotNullParameter(value, "value");
            return value.compareTo(hVar.getStart()) >= 0 && value.compareTo(hVar.getEndInclusive()) <= 0;
        }

        public static <T extends Comparable<? super T>> boolean isEmpty(h hVar) {
            return hVar.getStart().compareTo(hVar.getEndInclusive()) > 0;
        }
    }

    boolean contains(Comparable<Object> comparable);

    Comparable<Object> getEndInclusive();

    Comparable<Object> getStart();

    boolean isEmpty();
}
