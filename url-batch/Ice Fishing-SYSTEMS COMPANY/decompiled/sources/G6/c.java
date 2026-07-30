package G6;

import com.anythink.basead.ui.GuideToClickView;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f1204a = Collections.unmodifiableSet(new HashSet(Arrays.asList(429, 502, Integer.valueOf(GuideToClickView.a.f10240c), 504)));

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        hashSet.add(4);
        hashSet.add(8);
        hashSet.add(10);
        hashSet.add(11);
        hashSet.add(14);
        hashSet.add(15);
        Collections.unmodifiableSet((Set) hashSet.stream().map(new b(0)).collect(Collectors.toSet()));
    }
}
