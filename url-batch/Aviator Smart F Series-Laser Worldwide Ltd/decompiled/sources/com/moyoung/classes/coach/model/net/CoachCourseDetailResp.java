package com.moyoung.classes.coach.model.net;

import com.moyoung.classes.ClassesLanguageBean;
import java.util.List;

/* loaded from: classes4.dex */
public class CoachCourseDetailResp {
    private String audio;
    private int cal_length;
    private List<Integer> categories;
    private CoursesAll courses;
    private String description;
    private int id;
    private int level;
    private String name;
    private List<ClassesLanguageBean> name_language;
    private String picture;
    private String prepareAudio;
    private String source_file;
    private String thumbnail;
    private int total_time;

    public static class Courses {
        private int consumption_time;
        private String denomination_of_dive;
        private int is_show_spent;
        private String loop_number;
        private String rest_duration;
        private Workout workout;

        public int getConsumption_time() {
            return this.consumption_time;
        }

        public String getDenomination_of_dive() {
            return this.denomination_of_dive;
        }

        public int getIs_show_spent() {
            return this.is_show_spent;
        }

        public String getLoop_number() {
            return this.loop_number;
        }

        public String getRest_duration() {
            return this.rest_duration;
        }

        public Workout getWorkout() {
            return this.workout;
        }
    }

    public static class CoursesAll {
        private List<Courses> draw;
        private List<Courses> physical;
        private List<Courses> warn_up;

        public List<Courses> getDraw() {
            return this.draw;
        }

        public List<Courses> getPhysical() {
            return this.physical;
        }

        public List<Courses> getWarn_up() {
            return this.warn_up;
        }
    }

    public static class Language {
        private String code;
        private String translate;

        public String getCode() {
            return this.code;
        }

        public String getTranslate() {
            return this.translate;
        }
    }

    public static class Workout {
        private String action_explanation_audio;
        private String action_name_audio;
        private int id;
        private String name;
        private List<ClassesLanguageBean> name_language;
        private String picture;
        private String rest_audio;
        private String video;
        private int video_time;

        public String getAction_explanation_audio() {
            return this.action_explanation_audio;
        }

        public String getAction_name_audio() {
            return this.action_name_audio;
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        public List<ClassesLanguageBean> getName_language() {
            return this.name_language;
        }

        public String getPicture() {
            return this.picture;
        }

        public String getRest_audio() {
            return this.rest_audio;
        }

        public String getVideo() {
            return this.video;
        }

        public int getVideo_time() {
            return this.video_time;
        }
    }

    public String getAudio() {
        return this.audio;
    }

    public int getCal_length() {
        return this.cal_length;
    }

    public List<Integer> getCategories() {
        return this.categories;
    }

    public CoursesAll getCourses() {
        return this.courses;
    }

    public String getDescription() {
        return this.description;
    }

    public int getId() {
        return this.id;
    }

    public int getLevel() {
        return this.level;
    }

    public String getName() {
        return this.name;
    }

    public List<ClassesLanguageBean> getName_language() {
        return this.name_language;
    }

    public String getPicture() {
        return this.picture;
    }

    public String getPrepareAudio() {
        return this.prepareAudio;
    }

    public String getSource_file() {
        return this.source_file;
    }

    public String getThumbnail() {
        return this.thumbnail;
    }

    public int getTotal_time() {
        return this.total_time;
    }
}
