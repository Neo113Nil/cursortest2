package o6;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class a implements b {
    private List<org.ahocorasick.trie.a> emits = new ArrayList();

    @Override // o6.b
    public void emit(org.ahocorasick.trie.a aVar) {
        this.emits.add(aVar);
    }

    public List<org.ahocorasick.trie.a> getEmits() {
        return this.emits;
    }
}
