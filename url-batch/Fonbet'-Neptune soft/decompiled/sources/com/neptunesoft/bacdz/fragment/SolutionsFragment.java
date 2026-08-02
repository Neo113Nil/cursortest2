package com.neptunesoft.bacdz.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.neptunesoft.bacdz.R;
import com.neptunesoft.bacdz.SplashScreen;
import com.neptunesoft.bacdz.adapter.SolutionsAdapter;
import com.neptunesoft.bacdz.classobjects.Separate;
import com.neptunesoft.bacdz.classobjects.Solutions;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.objectweb.asm.Opcodes;

/* loaded from: classes4.dex */
public class SolutionsFragment extends Fragment {
    public static List<Object> list;
    private final String[] files = {"correction-bac-sci-sciences-2025.pdf", "correction-bac-sc-math-2025.pdf", "correction-bac-sc-physique-2025.pdf", "correction-bac-sc-arabic-2025.pdf", "correction-bac-sc-his-geo-2025.pdf", "correction-bac-islamic-2025.pdf", "correction-bac-sc-philo-2025.pdf", "correction-bac-sc-english-2025.pdf", "correction-bac-sc-french-2025.pdf", "bac2024-sciences-se-correction.pdf", "bac2024-math-se-correction.pdf", "bac2024-physics-se-correction.pdf", "bac2024-arabic-sci-correction.pdf", "bac2024-hisgeo-semtm-correction.pdf", "bac2024-islamic-correction.pdf", "bac2024-philo-sem-correction.pdf", "bac2024-english-sci-correction.pdf", "bac2024-french-sci-correction.pdf", "bac2023-science-se-correction.pdf", "bac2023-math-se-correction.pdf", "bac2023-physics-se-correction.pdf", "bac2023-arabic-sci-correction.pdf", "bac2023-hisgeo-semtm-correction.pdf", "bac2023-islamic-correction.pdf", "bac2023-philo-sem-correction.pdf", "bac2023-english-sci-correction.pdf", "bac2023-french-sci-correction.pdf", "bac2022-sciences-se_correction.pdf", "bac2022-math-se_correction.pdf", "bac2022-physics-se_correction.pdf", "bac2022-arabic-sci_correction.pdf", "bac2022-hisgeo-semtm_correction.pdf", "bac2022-islamic_correction.pdf", "bac2022-philo-sem_correction.pdf", "bac2022-english-sci_correction.pdf", "bac2022-french-sci_correction.pdf", "sciences-sci-bac2021_correction.pdf", "math-sci-bac2021_correction.pdf", "phisique-sci-bac2021_correction.pdf", "arabic-sci-bac2021_correction.pdf", "hisgeo-sci-bac2021_correction.pdf", "islamique-sci-bac2021_correction.pdf", "philo-sci-bac2021_correction.pdf", "english-sci-bac2021_correction.pdf", "francais-sci-bac2021_correction.pdf", "sciences_se_bac2020_correction.pdf", "math_se_bac2020_correction.pdf", "physics_se_bac2020_correction.pdf", "arabic_sci_bac2020_correction.pdf", "hisgeo_semtm_bac2020_correction.pdf", "islamic_bac2020_correction.pdf", "philo_sem_bac2020_correction.pdf", "english-sci-bac2020-correction.pdf", "french_sci_bac2020_correction.pdf", "sciences_se_bac2019_correction.pdf", "math_se_bac2019_correction.pdf", "physics_se_bac2019_correction.pdf", "arabic_sci_bac2019_correction.pdf", "hisgeo_semtm_bac2019_correction.pdf", "islamic_bac2019_correction.pdf", "philo_se_bac2019_correction.pdf", "english_sci_bac2019_correction.pdf", "french_sci_bac2019_correction.pdf", "sciences_se_bac2018_correction.pdf", "math_se_bac2018_correction.pdf", "physics_se_bac2018_correction.pdf", "arabic_sci_bac2018_correction.pdf", "hisgeo_semtm_bac2018_correction.pdf", "islamic_bac2018_correction.pdf", "philo_sem_bac2018_correction.pdf", "english_sci_bac2018_correction.pdf", "french_sci_bac2018_correction.pdf", "bac2017_2-sciences-se-correction.pdf", "bac2017_2-math-se-correction.pdf", "bac2017_2-physics-se-correction.pdf", "bac2017_2-arabic-sci-correction.pdf", "bac2017_2-hisgeo-semtm-correction.pdf", "bac2017_2-islamic-correction.pdf", "bac2017_2-philo-sem-correction.pdf", "bac2017_2-english-sci-correction.pdf", "bac2017_2-french-sci-correction.pdf", "sciences_se_bac2017_correction.pdf", "math_se_bac2017_correction.pdf", "physics_se_bac2017_correction.pdf", "arabic_sci_bac2017_correction.pdf", "hisgeo_semtm_bac2017_correction.pdf", "islamic_bac2017_correction.pdf", "philo_sem_bac2017_correction.pdf", "english_sci_bac2017_correction.pdf", "french_sci_bac2017_correction.pdf", "sciences-se-bac2016_2-correction.pdf", "math-se-bac2016_2-correction.pdf", "physics-se-bac2016_2-correction.pdf", "arabic-sci-bac2016-correction.pdf", "hisgeo-semtm-bac2016_2-correction.pdf", "islamic-bac2016-correction.pdf", "philo-sem-bac2016_2-correction.pdf", "english-sci-bac2016_2-correction.pdf", "french-sci-bac2016_2-correction.pdf", "sciences-se-bac2016-correction.pdf", "math-se-bac2016-correction.pdf", "physics-se-bac2016-correction.pdf", "hisgeo-semtm-bac2016-correction.pdf", "philo-sem-bac2016-correction.pdf", "english-sci-bac2016-correction.pdf", "french-sci-bac2016-correction.pdf", "sciences-se-bac2015-correction.pdf", "math-se-bac2015-correction.pdf", "physics-se-bac2015-correction.pdf", "arabic-sci-bac2015-correction.pdf", "hisgeo-semtm-bac2015-correction.pdf", "islamic-bac2015-correction.pdf", "philo-sem-bac2015-correction.pdf", "english-sci-bac2015-correction.pdf", "french-sci-bac2015-correction.pdf", "sciences-se-bac2014-correction.pdf", "math-se-bac2014-correction.pdf", "physics-se-bac2014-correction.pdf", "arabic-sci-bac2014-correction.pdf", "hisgeo-semtm-bac2014-correction.pdf", "islamic-bac2014-correction.pdf", "phylo-sem-bac2014-correction.pdf", "english-sci-bac2014-correction.pdf", "french-sci-bac2014-correction.pdf", "sciences-se-bac2013-correction.pdf", "math-se-bac2013-correction.pdf", "physics-se-bac2013-correction.pdf", "arabic-sci-bac2013-correction.pdf", "hisgeo-semtm-bac2013-correction.pdf", "islamic-bac2013-correction.pdf", "philosophy-sem-bac2013-correction.pdf", "english-sci-bac2013-correction.pdf", "french-sci-bac2013-correction.pdf", "sciences-se-bac2012-correction.pdf", "math-se-bac2012-correction.pdf", "physics-se-bac2012-correction.pdf", "arabic-sci-bac2012-correction.pdf", "hisgeo-semtm-bac2012-correction.pdf", "islamic-bac2012-correction.pdf", "philosophy-sem-bac2012-correction.pdf", "english-sci-bac2012-correction.pdf", "french-sci-bac2012-correction.pdf", "eddirasa-com-correction-bac-sci-science-2011.pdf", "eddirasa-com-correction-bac-sci-math-2011.pdf", "eddirasa-com-correction-bac-sci-physique-2011.pdf", "eddirasa-com-correction-bac-ge-ara-2011.pdf", "eddirasa-com-correction-bac-sci-his-geo-2011.pdf", "eddirasa-com-correction-bac-li-islamic-2011.pdf", "eddirasa-com-correction-bac-ge-philo-2011.pdf", "eddirasa-com-correction-bac-ge-eng-2011.pdf", "eddirasa-com-correction-bac-ge-fra-2011.pdf", "eddirasa-com-correction-bac-sci-science-2010.pdf", "eddirasa-com-correction-bac-sci-math-2010.pdf", "eddirasa-com-correction-bac-sci-physique-2010.pdf", "eddirasa-com-correction-bac-ge-ara-2010.pdf", "eddirasa-com-correction-bac-sci-his-geo-2010.pdf", "eddirasa-com-correction-bac-li-islamic-2010.pdf", "eddirasa-com-correction-bac-ge-philo-2010.pdf", "eddirasa-com-correction-bac-ge-eng-2010.pdf", "eddirasa-com-correction-bac-ge-fra-2010.pdf", "eddirasa-correction-bac-sci-science-2009.pdf", "eddirasa-correction-bac-sci-math-2009.pdf", "eddirasa-correction-bac-sci-physique-2009.pdf", "eddirasa-correction-bac-ge-ara-2009.pdf", "eddirasa-correction-bac-sci-his-geo-2009.pdf", "eddirasa-correction-bac-li-islamic-2009.pdf", "eddirasa-correction-bac-ge-philo-2009.pdf", "eddirasa-correction-bac-ge-eng-2009.pdf", "eddirasa-correction-bac-ge-fra-2009.pdf", "eddirasa-correction-bac-sci-science-2008.pdf", "eddirasa-correction-bac-sci-math-2008.pdf", "eddirasa-correction-bac-sci-physique-2008.pdf", "eddirasa-correction-bac-ge-ara-2008.pdf", "eddirasa-correction-bac-sci-his-geo-2008.pdf", "eddirasa-correction-bac-li-islamic-2008.pdf", "eddirasa-correction-bac-ge-philo-2008.pdf", "eddirasa-correction-bac-ge-eng-2008.pdf", "eddirasa-correction-bac-ge-fra-2008.pdf"};
    View view;

    public boolean files_exist(String fileName) {
        return new File(requireActivity().getFilesDir(), fileName).exists();
    }

    private Solutions prepareSolutions(Solutions solutions, int position) {
        if (SplashScreen.darkmode) {
            if (files_exist(this.files[position])) {
                return new Solutions(solutions.getModule(), solutions.getInformation(), R.drawable.ic_startabinsidecircle_dark);
            }
            return new Solutions(solutions.getModule(), solutions.getInformation(), R.drawable.ic_download_dark);
        }
        if (files_exist(this.files[position])) {
            return new Solutions(solutions.getModule(), solutions.getInformation(), R.drawable.ic_startabinsidecircle);
        }
        return new Solutions(solutions.getModule(), solutions.getInformation(), R.drawable.ic_download);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayList arrayList = new ArrayList();
        list = arrayList;
        arrayList.add(new Separate("بكالوريا 2025", SplashScreen.darkmode));
        list.add(prepareSolutions(new Solutions("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0), 0));
        list.add(prepareSolutions(new Solutions("الرياضيات", "الموضوع 1 + 2", 0), 1));
        list.add(prepareSolutions(new Solutions("العلوم الفيزيائية", "الموضوع 1 + 2", 0), 2));
        list.add(prepareSolutions(new Solutions("اللغة العربية و آدابها", "الموضوع 1 + 2", 0), 3));
        list.add(prepareSolutions(new Solutions("الإجتماعيات", "الموضوع 1 + 2", 0), 4));
        list.add(prepareSolutions(new Solutions("العلوم الإسلامية", "الموضوع 1 + 2", 0), 5));
        list.add(prepareSolutions(new Solutions("الفلسفة", "الموضوع 1 + 2 + 3", 0), 6));
        list.add(prepareSolutions(new Solutions("English", "الموضوع 1 + 2", 0), 7));
        list.add(prepareSolutions(new Solutions("Français", "الموضوع 1 + 2", 0), 8));
        list.add(new Separate("بكالوريا 2024", SplashScreen.darkmode));
        list.add(prepareSolutions(new Solutions("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0), 9));
        list.add(prepareSolutions(new Solutions("الرياضيات", "الموضوع 1 + 2", 0), 10));
        list.add(prepareSolutions(new Solutions("العلوم الفيزيائية", "الموضوع 1 + 2", 0), 11));
        list.add(prepareSolutions(new Solutions("اللغة العربية و آدابها", "الموضوع 1 + 2", 0), 12));
        list.add(prepareSolutions(new Solutions("الإجتماعيات", "الموضوع 1 + 2", 0), 13));
        list.add(prepareSolutions(new Solutions("العلوم الإسلامية", "الموضوع 1 + 2", 0), 14));
        list.add(prepareSolutions(new Solutions("الفلسفة", "الموضوع 1 + 2 + 3", 0), 15));
        list.add(prepareSolutions(new Solutions("English", "الموضوع 1 + 2", 0), 16));
        list.add(prepareSolutions(new Solutions("Français", "الموضوع 1 + 2", 0), 17));
        list.add(new Separate("بكالوريا 2023", SplashScreen.darkmode));
        list.add(prepareSolutions(new Solutions("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0), 18));
        list.add(prepareSolutions(new Solutions("الرياضيات", "الموضوع 1 + 2", 0), 19));
        list.add(prepareSolutions(new Solutions("العلوم الفيزيائية", "الموضوع 1 + 2", 0), 20));
        list.add(prepareSolutions(new Solutions("اللغة العربية و آدابها", "الموضوع 1 + 2", 0), 21));
        list.add(prepareSolutions(new Solutions("الإجتماعيات", "الموضوع 1 + 2", 0), 22));
        list.add(prepareSolutions(new Solutions("العلوم الإسلامية", "الموضوع 1 + 2", 0), 23));
        list.add(prepareSolutions(new Solutions("الفلسفة", "الموضوع 1 + 2 + 3", 0), 24));
        list.add(prepareSolutions(new Solutions("English", "الموضوع 1 + 2", 0), 25));
        list.add(prepareSolutions(new Solutions("Français", "الموضوع 1 + 2", 0), 26));
        list.add(new Separate("بكالوريا 2022", SplashScreen.darkmode));
        list.add(prepareSolutions(new Solutions("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0), 27));
        list.add(prepareSolutions(new Solutions("الرياضيات", "الموضوع 1 + 2", 0), 28));
        list.add(prepareSolutions(new Solutions("العلوم الفيزيائية", "الموضوع 1 + 2", 0), 29));
        list.add(prepareSolutions(new Solutions("اللغة العربية و آدابها", "الموضوع 1 + 2", 0), 30));
        list.add(prepareSolutions(new Solutions("الإجتماعيات", "الموضوع 1 + 2", 0), 31));
        list.add(prepareSolutions(new Solutions("العلوم الإسلامية", "الموضوع 1 + 2", 0), 32));
        list.add(prepareSolutions(new Solutions("الفلسفة", "الموضوع 1 + 2 + 3", 0), 33));
        list.add(prepareSolutions(new Solutions("English", "الموضوع 1 + 2", 0), 34));
        list.add(prepareSolutions(new Solutions("Français", "الموضوع 1 + 2", 0), 35));
        list.add(new Separate("بكالوريا 2021", SplashScreen.darkmode));
        list.add(prepareSolutions(new Solutions("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0), 36));
        list.add(prepareSolutions(new Solutions("الرياضيات", "الموضوع 1 + 2", 0), 37));
        list.add(prepareSolutions(new Solutions("العلوم الفيزيائية", "الموضوع 1 + 2", 0), 38));
        list.add(prepareSolutions(new Solutions("اللغة العربية و آدابها", "الموضوع 1 + 2", 0), 39));
        list.add(prepareSolutions(new Solutions("الإجتماعيات", "الموضوع 1 + 2", 0), 40));
        list.add(prepareSolutions(new Solutions("العلوم الإسلامية", "الموضوع 1 + 2", 0), 41));
        list.add(prepareSolutions(new Solutions("الفلسفة", "الموضوع 1 + 2 + 3", 0), 42));
        list.add(prepareSolutions(new Solutions("English", "الموضوع 1 + 2", 0), 43));
        list.add(prepareSolutions(new Solutions("Français", "الموضوع 1 + 2", 0), 44));
        list.add(new Separate("بكالوريا 2020", SplashScreen.darkmode));
        list.add(prepareSolutions(new Solutions("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0), 45));
        list.add(prepareSolutions(new Solutions("الرياضيات", "الموضوع 1 + 2", 0), 46));
        list.add(prepareSolutions(new Solutions("العلوم الفيزيائية", "الموضوع 1 + 2", 0), 47));
        list.add(prepareSolutions(new Solutions("اللغة العربية و آدابها", "الموضوع 1 + 2", 0), 48));
        list.add(prepareSolutions(new Solutions("الإجتماعيات", "الموضوع 1 + 2", 0), 49));
        list.add(prepareSolutions(new Solutions("العلوم الإسلامية", "الموضوع 1 + 2", 0), 50));
        list.add(prepareSolutions(new Solutions("الفلسفة", "الموضوع 1 + 2 + 3", 0), 51));
        list.add(prepareSolutions(new Solutions("English", "الموضوع 1 + 2", 0), 52));
        list.add(prepareSolutions(new Solutions("Français", "الموضوع 1 + 2", 0), 53));
        list.add(new Separate("بكالوريا 2019", SplashScreen.darkmode));
        list.add(prepareSolutions(new Solutions("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0), 54));
        list.add(prepareSolutions(new Solutions("الرياضيات", "الموضوع 1 + 2", 0), 55));
        list.add(prepareSolutions(new Solutions("العلوم الفيزيائية", "الموضوع 1 + 2", 0), 56));
        list.add(prepareSolutions(new Solutions("اللغة العربية و آدابها", "الموضوع 1 + 2", 0), 57));
        list.add(prepareSolutions(new Solutions("الإجتماعيات", "الموضوع 1 + 2", 0), 58));
        list.add(prepareSolutions(new Solutions("العلوم الإسلامية", "الموضوع 1 + 2", 0), 59));
        list.add(prepareSolutions(new Solutions("الفلسفة", "الموضوع 1 + 2 + 3", 0), 60));
        list.add(prepareSolutions(new Solutions("English", "الموضوع 1 + 2", 0), 61));
        list.add(prepareSolutions(new Solutions("Français", "الموضوع 1 + 2", 0), 62));
        list.add(new Separate("بكالوريا 2018", SplashScreen.darkmode));
        list.add(prepareSolutions(new Solutions("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0), 63));
        list.add(prepareSolutions(new Solutions("الرياضيات", "الموضوع 1 + 2", 0), 64));
        list.add(prepareSolutions(new Solutions("العلوم الفيزيائية", "الموضوع 1 + 2", 0), 65));
        list.add(prepareSolutions(new Solutions("اللغة العربية و آدابها", "الموضوع 1 + 2", 0), 66));
        list.add(prepareSolutions(new Solutions("الإجتماعيات", "الموضوع 1 + 2", 0), 67));
        list.add(prepareSolutions(new Solutions("العلوم الإسلامية", "الموضوع 1 + 2", 0), 68));
        list.add(prepareSolutions(new Solutions("الفلسفة", "الموضوع 1 + 2 + 3", 0), 69));
        list.add(prepareSolutions(new Solutions("English", "الموضوع 1 + 2", 0), 70));
        list.add(prepareSolutions(new Solutions("Français", "الموضوع 1 + 2", 0), 71));
        list.add(new Separate("بكالوريا 2017", SplashScreen.darkmode));
        list.add(prepareSolutions(new Solutions("علوم الطبيعة و الحياة", "الموضوع 1 + 2 | الدورة 2", 0), 72));
        list.add(prepareSolutions(new Solutions("الرياضيات", "الموضوع 1 + 2 | الدورة 2", 0), 73));
        list.add(prepareSolutions(new Solutions("العلوم الفيزيائية", "الموضوع 1 + 2 | الدورة 2", 0), 74));
        list.add(prepareSolutions(new Solutions("اللغة العربية و آدابها", "الموضوع 1 + 2 | الدورة 2", 0), 75));
        list.add(prepareSolutions(new Solutions("الإجتماعيات", "الموضوع 1 + 2 | الدورة 2", 0), 76));
        list.add(prepareSolutions(new Solutions("العلوم الإسلامية", "الموضوع 1 + 2 | الدورة 2", 0), 77));
        list.add(prepareSolutions(new Solutions("الفلسفة", "الموضوع 1 + 2 + 3 | الدورة 2", 0), 78));
        list.add(prepareSolutions(new Solutions("English", "الموضوع 1 + 2 | الدورة 2", 0), 79));
        list.add(prepareSolutions(new Solutions("Français", "الموضوع 1 + 2 | الدورة 2", 0), 80));
        list.add(prepareSolutions(new Solutions("علوم الطبيعة و الحياة", "الموضوع 1 + 2 | الدورة 1", 0), 81));
        list.add(prepareSolutions(new Solutions("الرياضيات", "الموضوع 1 + 2 | الدورة 1", 0), 82));
        list.add(prepareSolutions(new Solutions("العلوم الفيزيائية", "الموضوع 1 + 2 | الدورة 1", 0), 83));
        list.add(prepareSolutions(new Solutions("اللغة العربية و آدابها", "الموضوع 1 + 2 | الدورة 1", 0), 84));
        list.add(prepareSolutions(new Solutions("الإجتماعيات", "الموضوع 1 + 2 | الدورة 1", 0), 85));
        list.add(prepareSolutions(new Solutions("العلوم الإسلامية", "الموضوع 1 + 2 | الدورة 1", 0), 86));
        list.add(prepareSolutions(new Solutions("الفلسفة", "الموضوع 1 + 2 + 3 | الدورة 1", 0), 87));
        list.add(prepareSolutions(new Solutions("English", "الموضوع 1 + 2 | الدورة 1", 0), 88));
        list.add(prepareSolutions(new Solutions("Français", "الموضوع 1 + 2 | الدورة 1", 0), 89));
        list.add(new Separate("بكالوريا 2016", SplashScreen.darkmode));
        list.add(prepareSolutions(new Solutions("علوم الطبيعة و الحياة", "الموضوع 1 + 2 | الدورة 2", 0), 90));
        list.add(prepareSolutions(new Solutions("الرياضيات", "الموضوع 1 + 2 | الدورة 2", 0), 91));
        list.add(prepareSolutions(new Solutions("العلوم الفيزيائية", "الموضوع 1 + 2 | الدورة 2", 0), 92));
        list.add(prepareSolutions(new Solutions("اللغة العربية و آدابها", "الموضوع 1 + 2 | الدورة 2", 0), 93));
        list.add(prepareSolutions(new Solutions("الإجتماعيات", "الموضوع 1 + 2 | الدورة 2", 0), 94));
        list.add(prepareSolutions(new Solutions("العلوم الإسلامية", "الموضوع 1 + 2 | الدورة 2", 0), 95));
        list.add(prepareSolutions(new Solutions("الفلسفة", "الموضوع 1 + 2 + 3 | الدورة 2", 0), 96));
        list.add(prepareSolutions(new Solutions("English", "الموضوع 1 + 2 | الدورة 2", 0), 97));
        list.add(prepareSolutions(new Solutions("Français", "الموضوع 1 + 2 | الدورة 2", 0), 98));
        list.add(prepareSolutions(new Solutions("علوم الطبيعة و الحياة", "الموضوع 1 + 2 | الدورة المسربة", 0), 99));
        list.add(prepareSolutions(new Solutions("الرياضيات", "الموضوع 1 + 2 | الدورة المسربة", 0), 100));
        list.add(prepareSolutions(new Solutions("العلوم الفيزيائية", "الموضوع 1 + 2 | الدورة المسربة", 0), 101));
        list.add(prepareSolutions(new Solutions("الإجتماعيات", "الموضوع 1 + 2 | الدورة المسربة", 0), 102));
        list.add(prepareSolutions(new Solutions("الفلسفة", "الموضوع 1 + 2 + 3 | الدورة المسربة", 0), 103));
        list.add(prepareSolutions(new Solutions("English", "الموضوع 1 + 2 | الدورة المسربة", 0), 104));
        list.add(prepareSolutions(new Solutions("Français", "الموضوع 1 + 2 | الدورة المسربة", 0), 105));
        list.add(new Separate("بكالوريا 2015", SplashScreen.darkmode));
        list.add(prepareSolutions(new Solutions("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0), 106));
        list.add(prepareSolutions(new Solutions("الرياضيات", "الموضوع 1 + 2", 0), 107));
        list.add(prepareSolutions(new Solutions("العلوم الفيزيائية", "الموضوع 1 + 2", 0), 108));
        list.add(prepareSolutions(new Solutions("اللغة العربية و آدابها", "الموضوع 1 + 2", 0), 109));
        list.add(prepareSolutions(new Solutions("الإجتماعيات", "الموضوع 1 + 2", 0), 110));
        list.add(prepareSolutions(new Solutions("العلوم الإسلامية", "الموضوع 1 + 2", 0), 111));
        list.add(prepareSolutions(new Solutions("الفلسفة", "الموضوع 1 + 2 + 3", 0), 112));
        list.add(prepareSolutions(new Solutions("English", "الموضوع 1 + 2", 0), 113));
        list.add(prepareSolutions(new Solutions("Français", "الموضوع 1 + 2", 0), 114));
        list.add(new Separate("بكالوريا 2014", SplashScreen.darkmode));
        list.add(prepareSolutions(new Solutions("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0), 115));
        list.add(prepareSolutions(new Solutions("الرياضيات", "الموضوع 1 + 2", 0), 116));
        list.add(prepareSolutions(new Solutions("العلوم الفيزيائية", "الموضوع 1 + 2", 0), 117));
        list.add(prepareSolutions(new Solutions("اللغة العربية و آدابها", "الموضوع 1 + 2", 0), 118));
        list.add(prepareSolutions(new Solutions("الإجتماعيات", "الموضوع 1 + 2", 0), 119));
        list.add(prepareSolutions(new Solutions("العلوم الإسلامية", "الموضوع 1 + 2", 0), 120));
        list.add(prepareSolutions(new Solutions("الفلسفة", "الموضوع 1 + 2 + 3", 0), 121));
        list.add(prepareSolutions(new Solutions("English", "الموضوع 1 + 2", 0), 122));
        list.add(prepareSolutions(new Solutions("Français", "الموضوع 1 + 2", 0), 123));
        list.add(new Separate("بكالوريا 2013", SplashScreen.darkmode));
        list.add(prepareSolutions(new Solutions("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0), 124));
        list.add(prepareSolutions(new Solutions("الرياضيات", "الموضوع 1 + 2", 0), 125));
        list.add(prepareSolutions(new Solutions("العلوم الفيزيائية", "الموضوع 1 + 2", 0), 126));
        list.add(prepareSolutions(new Solutions("اللغة العربية و آدابها", "الموضوع 1 + 2", 0), 127));
        list.add(prepareSolutions(new Solutions("الإجتماعيات", "الموضوع 1 + 2", 0), 128));
        list.add(prepareSolutions(new Solutions("العلوم الإسلامية", "الموضوع 1 + 2", 0), Opcodes.LOR));
        list.add(prepareSolutions(new Solutions("الفلسفة", "الموضوع 1 + 2 + 3", 0), 130));
        list.add(prepareSolutions(new Solutions("English", "الموضوع 1 + 2", 0), Opcodes.LXOR));
        list.add(prepareSolutions(new Solutions("Français", "الموضوع 1 + 2", 0), Opcodes.IINC));
        list.add(new Separate("بكالوريا 2012", SplashScreen.darkmode));
        list.add(prepareSolutions(new Solutions("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0), Opcodes.I2L));
        list.add(prepareSolutions(new Solutions("الرياضيات", "الموضوع 1 + 2", 0), Opcodes.I2F));
        list.add(prepareSolutions(new Solutions("العلوم الفيزيائية", "الموضوع 1 + 2", 0), Opcodes.I2D));
        list.add(prepareSolutions(new Solutions("اللغة العربية و آدابها", "الموضوع 1 + 2", 0), Opcodes.L2I));
        list.add(prepareSolutions(new Solutions("الإجتماعيات", "الموضوع 1 + 2", 0), Opcodes.L2F));
        list.add(prepareSolutions(new Solutions("العلوم الإسلامية", "الموضوع 1 + 2", 0), Opcodes.L2D));
        list.add(prepareSolutions(new Solutions("الفلسفة", "الموضوع 1 + 2 + 3", 0), Opcodes.F2I));
        list.add(prepareSolutions(new Solutions("English", "الموضوع 1 + 2", 0), Opcodes.F2L));
        list.add(prepareSolutions(new Solutions("Français", "الموضوع 1 + 2", 0), Opcodes.F2D));
        list.add(new Separate("بكالوريا 2011", SplashScreen.darkmode));
        list.add(prepareSolutions(new Solutions("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0), Opcodes.D2I));
        list.add(prepareSolutions(new Solutions("الرياضيات", "الموضوع 1 + 2", 0), Opcodes.D2L));
        list.add(prepareSolutions(new Solutions("العلوم الفيزيائية", "الموضوع 1 + 2", 0), Opcodes.D2F));
        list.add(prepareSolutions(new Solutions("اللغة العربية و آدابها", "الموضوع 1 + 2", 0), Opcodes.I2B));
        list.add(prepareSolutions(new Solutions("الإجتماعيات", "الموضوع 1 + 2", 0), Opcodes.I2C));
        list.add(prepareSolutions(new Solutions("العلوم الإسلامية", "الموضوع 1 + 2", 0), Opcodes.I2S));
        list.add(prepareSolutions(new Solutions("الفلسفة", "الموضوع 1 + 2 + 3", 0), Opcodes.LCMP));
        list.add(prepareSolutions(new Solutions("English", "الموضوع 1 + 2", 0), Opcodes.FCMPL));
        list.add(prepareSolutions(new Solutions("Français", "الموضوع 1 + 2", 0), Opcodes.FCMPG));
        list.add(new Separate("بكالوريا 2010", SplashScreen.darkmode));
        list.add(prepareSolutions(new Solutions("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0), Opcodes.DCMPL));
        list.add(prepareSolutions(new Solutions("الرياضيات", "الموضوع 1 + 2", 0), Opcodes.DCMPG));
        list.add(prepareSolutions(new Solutions("العلوم الفيزيائية", "الموضوع 1 + 2", 0), 153));
        list.add(prepareSolutions(new Solutions("اللغة العربية و آدابها", "الموضوع 1 + 2", 0), 154));
        list.add(prepareSolutions(new Solutions("الإجتماعيات", "الموضوع 1 + 2", 0), 155));
        list.add(prepareSolutions(new Solutions("العلوم الإسلامية", "الموضوع 1 + 2", 0), 156));
        list.add(prepareSolutions(new Solutions("الفلسفة", "الموضوع 1 + 2 + 3", 0), 157));
        list.add(prepareSolutions(new Solutions("English", "الموضوع 1 + 2", 0), 158));
        list.add(prepareSolutions(new Solutions("Français", "الموضوع 1 + 2", 0), Opcodes.IF_ICMPEQ));
        list.add(new Separate("بكالوريا 2009", SplashScreen.darkmode));
        list.add(prepareSolutions(new Solutions("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0), Opcodes.IF_ICMPNE));
        list.add(prepareSolutions(new Solutions("الرياضيات", "الموضوع 1 + 2", 0), Opcodes.IF_ICMPLT));
        list.add(prepareSolutions(new Solutions("العلوم الفيزيائية", "الموضوع 1 + 2", 0), Opcodes.IF_ICMPGE));
        list.add(prepareSolutions(new Solutions("اللغة العربية و آدابها", "الموضوع 1 + 2", 0), Opcodes.IF_ICMPGT));
        list.add(prepareSolutions(new Solutions("الإجتماعيات", "الموضوع 1 + 2", 0), Opcodes.IF_ICMPLE));
        list.add(prepareSolutions(new Solutions("العلوم الإسلامية", "الموضوع 1 + 2", 0), Opcodes.IF_ACMPEQ));
        list.add(prepareSolutions(new Solutions("الفلسفة", "الموضوع 1 + 2 + 3", 0), Opcodes.IF_ACMPNE));
        list.add(prepareSolutions(new Solutions("English", "الموضوع 1 + 2", 0), Opcodes.GOTO));
        list.add(prepareSolutions(new Solutions("Français", "الموضوع 1 + 2", 0), Opcodes.JSR));
        list.add(new Separate("بكالوريا 2008", SplashScreen.darkmode));
        list.add(prepareSolutions(new Solutions("علوم الطبيعة و الحياة", "الموضوع 1 + 2", 0), Opcodes.RET));
        list.add(prepareSolutions(new Solutions("الرياضيات", "الموضوع 1 + 2", 0), Opcodes.TABLESWITCH));
        list.add(prepareSolutions(new Solutions("العلوم الفيزيائية", "الموضوع 1 + 2", 0), Opcodes.LOOKUPSWITCH));
        list.add(prepareSolutions(new Solutions("اللغة العربية و آدابها", "الموضوع 1 + 2", 0), Opcodes.IRETURN));
        list.add(prepareSolutions(new Solutions("الإجتماعيات", "الموضوع 1 + 2", 0), Opcodes.LRETURN));
        list.add(prepareSolutions(new Solutions("العلوم الإسلامية", "الموضوع 1 + 2", 0), Opcodes.FRETURN));
        list.add(prepareSolutions(new Solutions("الفلسفة", "الموضوع 1 + 2 + 3", 0), Opcodes.DRETURN));
        list.add(prepareSolutions(new Solutions("English", "الموضوع 1 + 2", 0), Opcodes.ARETURN));
        list.add(prepareSolutions(new Solutions("Français", "الموضوع 1 + 2", 0), Opcodes.RETURN));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_solutions, container, false);
        this.view = inflate;
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.solutionsRecyclerView);
        SolutionsAdapter solutionsAdapter = new SolutionsAdapter(list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(solutionsAdapter);
        return this.view;
    }
}
