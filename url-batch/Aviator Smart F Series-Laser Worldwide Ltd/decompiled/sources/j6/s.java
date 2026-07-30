package j6;

/* loaded from: classes4.dex */
public interface s {

    public static final class a {
        public static <T extends Comparable<? super T>> boolean contains(s sVar, T value) {
            kotlin.jvm.internal.s.checkNotNullParameter(value, "value");
            return value.compareTo(sVar.getStart()) >= 0 && value.compareTo(sVar.getEndExclusive()) < 0;
        }

        public static <T extends Comparable<? super T>> boolean isEmpty(s sVar) {
            return sVar.getStart().compareTo(sVar.getEndExclusive()) >= 0;
        }
    }

    boolean contains(Comparable<Object> comparable);

    Comparable<Object> getEndExclusive();

    Comparable<Object> getStart();

    boolean isEmpty();
}
